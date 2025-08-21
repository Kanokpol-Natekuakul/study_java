import java.util.Scanner;
class Input{
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.print("your name = ");
    String name=sc.nextLine();

    System.out.print("Year of birth =");
    int year =sc.nextInt();

    int age =2568-year;

    System.out.println(name);
    System.out.println(year);
    System.out.println(age);
  }
}