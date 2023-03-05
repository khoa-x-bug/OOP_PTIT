import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class LAB_TwoSum  {
    // Hằng số để biểu diễn trường hợp không tìm thấy cặp số nào
    private static final String NOT_FOUND = "Not found";

    /**
     * Tìm vị trí của hai số trong dãy có tổng bằng target.
     *
     * @param numbers dãy số nhập vào
     * @param target  tổng cần tìm kiếm
     * @return một mảng chứa vị trí của cặp số có tổng bằng target hoặc null nếu không tìm thấy
     */
    private static int[] findPair(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(numbers[i], i);
        }
        return null;
    }

    /**
     * In kết quả.
     *
     * @param result một mảng chứa vị trí của cặp số có tổng bằng target hoặc null nếu không tìm thấy
     */
    private static void printResult(int[] result) {
        if (result == null) {
            System.out.println(NOT_FOUND);
        } else {
            System.out.println(result[0] + " " + result[1]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numTestcases = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numTestcases; i++) {
            // Đọc dữ liệu đầu vào
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int[] numbers = new int[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = Integer.parseInt(tokenizer.nextToken());
            }
            int target = Integer.parseInt(tokenizer.nextToken());
            // Tìm vị trí của cặp số có tổng bằng target
            int[] result = findPair(numbers, target);
            // In kết quả
            printResult(result);
        }
    }
}
