import java.util.Scanner;

public class TinhHeSoLuong {
    public static void main(String[] args) {
        System.out.println("--------- Tinh he so luong cua Nhan Vien -----");

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ten cua nhan vien la: ");
        String ten = input.nextLine();

        System.out.println("Nhap vao He So Luong la: ");
        int hesoluong = input.nextInt();

        System.out.println("Nhap vao So nam lam viec la: ");
        int sonamlamviec = input.nextInt();

        if (hesoluong <= 5) {
            int luongthang = hesoluong * 4000000 + sonamlamviec * 500000;

            System.out.println("Luong mot thang cua " + ten + "la " + luongthang);
        }else {
            System.out.println("--------- He so luong cua nhan chi trong tu 1 den 5 ------");
        }

        System.out.println("-------- Thank you!!!! --------");
    }
}
