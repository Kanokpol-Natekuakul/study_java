class VarS{
  public static void main(String[] args) {
    String a = "100", b ="20";
    a=a+100; //"100"+100
    System.out.println(a);


      int c;
      c=Integer.parseInt(b); //String => int
      c=c+100;
      System.out.println(c);
    

      //int => String
      int num1 =60;
      String s = String.valueOf(num1);
      System.out.println(s);
  }
}