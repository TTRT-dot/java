import java.util.logging.Handler;

class hillstations{
    void location(){
        System.out.println("Location is");
    }
    void famousfor(){
        System.out.println("Famous For");
    }

}

class Manali extends hillstations{
    void location(){
        System.out.println("Manali is in Himachal Pradesh");
    }
    void famousfor(){
        System.out.println("It is famous for Hadimba Temple and adventure sports");
    }

}
class Mussoorie extends hillstations{
    void location(){
        System.out.println("Mussoorie is in Uttarakhand");
    }
    void famousfor(){
        System.out.println("It is famous for education institions");
    }

}
class Gulmarg extends hillstations{
    void location(){
        System.out.println("Gulmarg is in Jammu and Kashmir");
    }
    void famousfor(){
        System.out.println("It is famous for skiing");
    }
}
class Main1{
    public static void main(String[] args) {
        hillstations A= new hillstations();
        hillstations M= new Manali();
        hillstations Mu= new Mussoorie();
        hillstations G= new Gulmarg();

        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();

        G.location();
        G.famousfor();
    }
}

