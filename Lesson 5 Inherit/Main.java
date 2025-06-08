class Parent
{
    int age,id;
    String name;
    void naming(String name)
    {
        System.out.println("Name: "+name);
    }
}

class child extends Parent
{
    void ageN(int age)
    {
        System.out.println("The age of student is : "+age);
    }
}

class Main
{
    public static void main(String[] er)
    {
        child s= new child();//creating object of child class
        s.naming("Aashish");
        s.ageN(14);

    }
}
