class Animal{
    void eat(){
        System.out.println("Eating...animal class...eat method");
    }
}

class lion extends Animal{
    void roar(){
        System.out.println("roar...animal class...roar method");
    }
}

class babylion extends lion {
    void weep() {
        System.out.println("weeping...animal class...weep method");
    }
}

class Main{
    public static void main(String args[])
    babylion obj=new babylion();//object of child class
    obj.weep();
    obj.roar();
    obj.eat();
}