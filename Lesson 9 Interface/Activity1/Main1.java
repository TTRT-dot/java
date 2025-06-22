interface myinterface{
    /*
     * compiler will treat them as
     * public abstract void method1();
     * public abstract void method2();
     */
    public void method1();
    public void method2();
}
class Main1 implements myinterface{
    //implements=use methods from interface myinterface
    /*This class must implement both abstract methods
     * else you will get compliation error
     * Try removing 1 method and you will see
     */
    public void method1(){
        System.out.println("Implimentation of method 1");
    }
    
    public void method2() {
        System.out.println("Implimentation of method 2");
    }
    public static void main(String[] args) {
        myinterface obj = new Main1();
        obj.method1();
        obj.method2();
    }
}