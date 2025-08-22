import java.util.Scanner;

public class Assignment3 { //โปรแกรมหาเลขคู่ /เลขคี่
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        System.out.print("ตัวเลขจำนวนเต็ม : ");
        int num=k.nextInt();

        // % num % 2 ลงตัว => คู่
        // % num % 2 ไม่ลงตัว => คี่
        if(num%2==0){
            System.out.println("เป็นเลขคู่");
        }else{
            System.out.println("เป็นเลขคี่");
        }

        /*
         String result="";
         if(num%2==0){
            result = "เป็นเลขคู่";
        }else{
            result = "เป็นเลขคี่";
        }
            System.out.println(result);
         */
    }
}
