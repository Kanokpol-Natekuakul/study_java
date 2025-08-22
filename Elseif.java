import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("อายุของคุณ : ");
        int age = s.nextInt();
        if(age>=15 && age<=19){
            System.out.println("นาย/นางสาว");
        }
        else if(age>=20 && age<=29){
            System.out.println("หนุ่ม/สาว");
        }
        else if(age>=30 && age<=39){
            System.out.println("วัยทำงาน");
        }
        else if(age>=40 && age<=50){
            System.out.println("วันกลางคน");
        }else{
            System.out.println("ไม่พบช่วงอายุ");
        }
    }
}
