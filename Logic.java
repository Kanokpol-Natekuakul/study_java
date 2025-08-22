class Logic {
    public static void main(String[] args) {
        /*
            AND && และ false 1 = false
            OR || หรือ true 1 = true
            NOT ! ไม่(ตรงข้าม)
         */
        int a=10,b=20;
        boolean c =(a==b); //false
        boolean d =(a<b); //true
        // System.out.println(d);
        System.out.println((c&&d)); 
        System.out.println((c||d)); 
    } 
}
