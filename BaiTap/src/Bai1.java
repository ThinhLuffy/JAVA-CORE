import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println(" -----  Bai 1 ------ ");

        float diemLy,diemHoa,diemSinh;
        String ten;


        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ten cua ban la: ");
        ten = input.nextLine();

        System.out.println("Moi ban nhap vao diem Ly : ");
        diemLy = input.nextFloat();

        System.out.println("Moi ban nhap vao diem Hoa: ");
        diemHoa = input.nextFloat();

        System.out.println("Moi ban nhap vao diem Sinh: ");
        diemSinh = input.nextFloat();


        System.out.println("----- Tong diem cua ban " + ten + " --------- ");

        float Tong = diemHoa + diemLy + diemSinh;

        System.out.println("Ket qua la: " + Tong);

        System.out.println("---- Trung binh cong 3 mon ---- ");

        float TBC = Tong / 3;
        System.out.println("TBC la: " + TBC);

        System.out.println("----- Cam on ban da tham gia ---");
    }
}
