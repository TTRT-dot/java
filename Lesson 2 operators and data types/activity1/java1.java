package activity1;
class java1{
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int sum=a+b;
        int diff=a-b;
        int mult=a*b;
        int div=a/b;
        String magic="============================Magic===============================";
        System.out.println("==========================================================Method 1=====================================================================");
        System.out.println("A+B="+sum);
        System.out.println("A-B="+diff);
        System.out.println("A*B="+mult);
        System.out.println("A/B="+div);
        System.out.println("==========================================================Method 2=====================================================================");
        System.out.println("A+B="+(a+b));
        System.out.println("A-B="+(a-b));
        System.out.println("A*B="+(a*b));
        System.out.println("A/B="+(a/b));
        System.out.println("remainder of A/B"+(a%b));
        System.out.println(magic);
        System.out.println("Addition = "+(a+b)+" Substraction = "+(a-b)+" Multiplication = "+(a*b)+" Division = "+(a/b));
    }
}