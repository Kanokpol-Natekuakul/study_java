 

import java.util.Scanner;

class InputNextline{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณ = ");
        String name =a.nextLine();
        System.out.println(name);
    }
}
