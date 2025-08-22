import java.util.Scanner;

class Assignment2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ตัวเลขที่ 1 : ");
        int num1 =s.nextInt();
        System.out.print("ตัวเลขที่ 2 : ");
        int num2 =s.nextInt();

        if(num1>num2){
            System.out.println(num1+" มากกว่า "+num2);
        }else if(num1<num2){
            System.out.println(num1+" น้อยกว่า "+num2);
        }else{
            System.out.println(num1+" เท่ากับ "+num2);
        }
    }
}
