import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("ตัวเลขที่ 1 = ");
        int a=s.nextInt();
        System.out.print("ตัวเลขที่ 2 = ");
        int b=s.nextInt();

        // int a=10;
        // int b=9;

        System.out.println("sum = " + (a+b));
        System.out.println("ลบ = " + (a-b));
        System.out.println("คูณ = " + (a*b));
        System.out.println("หาร = " + (a/b));
        System.out.println("เศษ = " + (a%b));
    }
}
