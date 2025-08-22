public class Whileloop {
    public static void main(String[] args) {
        int count=1;
        while (true) { //count<=10
            System.out.println(count+" Hello world");
            count++;
            if(count>1000) break;
        }
    }
}
