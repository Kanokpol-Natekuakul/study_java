 
class Variable2{
  public static void main(VarS[] args) {
    int a=100; //Global variable
    System.out.println(a);

    {
      int c=300; //local variable
      System.out.println(c);
    }

    // System.out.println(c);
  }
}
