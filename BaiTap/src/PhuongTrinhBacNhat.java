import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("----- Phuong Trinh Bac Nhat Mot An ---------");

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao so a: ");
        int a = input.nextInt();

        System.out.println("Nhap vao so b: ");
        int b = input.nextInt();


        if (a!=0)
        {
            double c= -b / a;
            System.out.println("Phuong trinh co mot nghiem duy nhat la: " + c);
        } else
        {
            if (b == 0)
            {
                System.out.println(" Phuong Trinh vo so nghiem ");
            } else
            {
                System.out.println(" Phuong trinh vo nghiem ");
            }

        }
    }
}
