import java.util.Scanner;

class Bmi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("น้ำหนัก : ");
        double weight =s.nextDouble();
        System.out.print("ส่วนสูง : ");
        double height =s.nextDouble();
        height/=100;

        double bmi=weight/(height*height);

        System.out.println(bmi);
    }
}
