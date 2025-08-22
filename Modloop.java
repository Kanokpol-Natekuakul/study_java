import java.util.Scanner;

public class Modloop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.print("ป้อนตัวเลข = ");
            int num=s.nextInt();
            if(num<0) break;

            if(num%2==0){
                System.out.println("เลขคู่");
            }else{
                System.out.println("เลขคี่");
            }
        }
    }
}
