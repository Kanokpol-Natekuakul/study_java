import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int max=0,min=Integer.MAX_VALUE;
        while (true) {
            System.out.print("ป้อนตัวเลข = ");
            int num=s.nextInt();
            if(num<0) break;
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }
}
