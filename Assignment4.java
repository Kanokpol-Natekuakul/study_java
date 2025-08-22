import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ป้อน พ.ศ. = ");
        int num =s.nextInt();

        num-=543;
        System.out.println(num);
    }
}
