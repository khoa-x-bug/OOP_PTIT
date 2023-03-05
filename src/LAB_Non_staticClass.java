/**
 * @author Khoa
 */
public class LAB_Non_staticClass {

    // Khai báo lớp SinhVien bên trong lớp Main
    class SinhVien {
        public String id;
        public String name;

        public SinhVien(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng SinhVien và in ra mã số và tên
        LAB_Non_staticClass outer = new LAB_Non_staticClass();
        SinhVien sinhVien001 = outer.new SinhVien("DCVT099", "Nguyen Nam");
        System.out.println(sinhVien001.id + " " + sinhVien001.name);
    }
}

