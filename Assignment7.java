import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        // Scanner x=new Scanner(System.in);
        // System.out.print("อุณหภูมิ (f) = ");
        // float fa=x.nextFloat();

        // float cel =(fa-32)*5/9;
        // System.out.println("อุณหภูมิ (c) = "+cel);


        Scanner x=new Scanner(System.in);
        System.out.print("อุณหภูมิ (c) = ");
        float cel=x.nextFloat();

        float fa = (cel*9/5)+32;
        System.out.println("อุณหภูมิ (f) = "+fa);
    }
}
