import java.util.Scanner;

public class Mutiply {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("เริ่มต้น = ");
        int start =s.nextInt();
        System.out.print("สุดท้าย = ");
        int stop =s.nextInt();
        for(int m=start;m<=stop;m++){
            System.err.println("--------------------");
            System.out.println("แม่ที่ = "+m);
            for(int x=1;x<=12;x++){
                System.out.println(m+ " x "+x+" = "+(m*x));
            }
        }
    }
}