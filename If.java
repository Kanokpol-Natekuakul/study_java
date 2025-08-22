import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        // boolean result=10>5;
        // if(result){
        //     System.out.println("10 มากกว่า 5");
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("อายุของคุณ : ");
        int age=sc.nextInt();
        if(age>=15){
            System.out.println("คำนำหน้า นาย/นางสาว");
        }else{
            System.out.println("คำนำหน้า เด็กชาย/เด็กหญิง");
        }
    }
}
