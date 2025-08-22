import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("ป้อนเลขเดือน = ");
        int month = x.nextInt();
        String name ="";
        switch (month) {
            case 1:
                name="มกราคม";
                break;
            case 2:
                name="กุมภา";
                break;
        
            default:
                name = "เดือนอื่นๆ";
                break;
        }
        System.out.println(name);
    }
}