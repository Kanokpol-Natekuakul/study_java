import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ป้อนค่า = ");
        int num=s.nextInt();

        //ตัวแปร =(เงื่อนไข)?เมื่อเป็นจริง:เมื่อเป็นเท็จ
        String result="";
        result=(num%2==0)?num+" = เลขคู่":num+" = เลขคี่";
        System.out.println(result);
    }
}