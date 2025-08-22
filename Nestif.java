import java.util.Scanner;

class Nestif {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("ป้อนอายุ : ");
        int age = s.nextInt();
        if(age<=15){
            System.out.println("ม.ต้น");
            if(age==15){
                System.out.println("ม.3");
            }
            else if(age==14){
                System.out.println("ม.2");
            }
            else if(age==13){
                System.out.println("ม.1");
            }
        }else{
            System.out.println("ม.ปลาย");
        }
    }
}