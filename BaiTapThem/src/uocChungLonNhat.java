import java.util.Scanner;

public class uocChungLonNhat {
    private static int nhap(){
        Scanner input = new Scanner(System.in);

        boolean check = false;
        int n= 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban chua nhap moi ban nhap vao!");
                input.nextLine();
            }
        }
        return (n);
    }

    private static int UCLN(int a, int b) {
        while (a!=b) {
            if (a>b)
                a = a-b;
            else
                b = b-a;
        }
        return (a);
    }
    public static void main(String[] args) {
        System.out.println("Nhap a: ");
        int a = nhap();
        System.out.println("Nhap b :");
        int b = nhap();

        System.out.println("UCLN cua " + a + " va" + b + " la:" + UCLN(a,b));
        System.out.println("BCNN cua " + a + " va" + b + " la:" + ((a*b)/UCLN(a,b)));

    }
}
