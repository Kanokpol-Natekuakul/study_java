import java.util.Scanner;

public class Bmi2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("น้ำหนัก : ");
        double weight=s.nextDouble();
        System.out.print("ส่วนสูง : ");
        double height=s.nextDouble();
        height/=100;
        double bmi = weight/(height*height);

        System.out.println("น้ำหนัก = "+weight);
        System.out.println("ส่วนสูง = "+height);
        System.out.println("bmi = "+bmi);

        String text="";

        if(bmi<18){
            text = "ต่ำกว่าเกณฑ์";
        }else if(bmi>=18.5 && bmi<=22.9){
            text="สมส่วน";
        }
        else if(bmi>=23 && bmi<=24.9){
            text="น้ำหนักเกิน";
        }
        else if(bmi>=25 && bmi<=29.9){
            text="โรคอ้วน";
        }else if(bmi>=30 && bmi<=70){
            text="โรคอ้วนระดับอันตราย";
        }else{
            text="ไม่ทราบค่า";
        }
        System.out.println(text);
    }
}
