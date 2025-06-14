class student
{
    int id;
    String name;
    float stripend;

    student(){}

    student(int id , String name){
        this.id = id;
        this.name = name;
    }
    
    student(int id , String name , float stripend){
        this.id = id;
        this.name = name;
        this.stripend = stripend;
    }

    void displayDetails(){
        System.out.println(this.id+" | "+this.name+"|"+this.stripend);
    }
}

class Main1
{
    public static void main(String[] args)
    {
        student st1=new student();
        student st2=new student(45,"Aashish");
        student st3=new student(234,"Cody",10000);

        st1.displayDetails();
        st2.displayDetails();
        st3.displayDetails();
    }
}