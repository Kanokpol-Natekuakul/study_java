public class Loopp {
    public static void main(String[] args) {
        // for(int i =1;i<=3;i++){
        //     System.out.println(i);
        //     for(int j=1;j<=5;j++){
        //         System.out.println(j);
        //     }
        // } //15
        int i=1,j=1;
        while (i<=3) {
            System.out.println(i);
            while (j<=5) {
                System.out.println(j);
                j++;
            }
            i++;  //8
        }
    }
}
