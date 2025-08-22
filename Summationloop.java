import java.util.Scanner;

public class Summationloop {
    public static void main(String[] args) {
        // int num=1,sum=0;
        // while (num<=3) {
        //     sum+=num;
        //     num++;
        // }
        // System.out.println(sum);
        Scanner s=new Scanner(System.in);
        int sum=0 ,count=0;
        while (true) {
            System.out.print("ตัวเลข = "); //จบโปรแกรมเมื่อใส่ค่า -
            int num =s.nextInt();
            if(num<0) break;
            count++;
            sum+=num;
        }
        System.out.println(sum);
        System.out.println(count);
        System.out.println("ค่าเฉลี่ย = "+sum/count);
    }
}
