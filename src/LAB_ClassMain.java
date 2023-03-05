import java.util.Scanner;

/**
 * @author Khoa
 */
public class LAB_ClassMain  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();
        scanner.nextLine(); // đọc bỏ dòng trống sau khi đọc số lượng test

        for (int i = 0; i < numTests; i++) {
            String line = scanner.nextLine();
            int numChars = line.length();
            int numWords = line.split("\\s+").length;
            System.out.printf("%d %d%n", numChars, numWords);
        }

        scanner.close();
    }
}
