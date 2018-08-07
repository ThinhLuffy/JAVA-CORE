import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("---------- Kiem tra Tuoi cua 1 ai do -----");

        Scanner input = new Scanner(System.in);


        System.out.println("Nhap ten cua ban: ");
        String ten = input.nextLine();

        System.out.println("Nhap nam sinh cua ban: ");
        int namSinh = input.nextInt();

        System.out.println("Nhap nam hien tai hoac tuong lai: ");
        int namHienTai = input.nextInt();

        System.out.println("---------- Thuc Hien Tinh Toan ----------");
        int ketQua = namHienTai - namSinh;


        System.out.println("Tuoi cua ban " + ten + " la: " + ketQua);

        System.out.println("Cam on ban da thu!!!! ");

    }
}
