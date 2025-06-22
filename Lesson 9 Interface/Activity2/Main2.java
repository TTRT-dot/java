interface vehicle{
        //all are the abstract methods.
        void changegear(int,a);
        void speedup(int,a);
        void applybrakes(int,a);
}
//we use keyword implements to inherit a interface
class Bicycle implements vehicle{
    int speed;
    int gear;
    
    //to change gear
    @Override
    public void changegear(int newgear){
        gear = newgear;
    }

    //to increse speed
    @Override
    public void speedup(int increment){
        speed=speed+increment;
    }
    
    //to decrease speed
    @Override
    public void applybrakes(int decrement){
        speed = speed - decrement;
    }
    public void printStates("Speed = "+speed+"Gear = "+gear);
}

class car implements vehicle{
    // to change gear
    @Override
    public void changegear(int newgear) {
        gear = newgear;
    }

    // to increse speed
    @Override
    public void speedup(int increment) {
        speed = speed + increment;
    }

    // to decrease speed
    @Override
        public void applybrakes(int decrement){
            speed = speed - decrement;
        }

    public void printStates("Speed = "+speed+"Gear = "+gear);
}

class Main2 {
      
    public static void main (String[] args) {
      
        // creating an inatance of Bicycle 
        // doing some operations 
        Bicycle bicycle = new Bicycle();
        bicycle.changegear(2);
        bicycle.speedup(3);
        bicycle.applybrakes(1);
          
        System.out.println("Bicycle present state :");
        bicycle.printStates();
          
        // creating instance of the car.
        Car car = new Car();
        car.changegear(1);
        car.speedup(4);
        car.applybrakes(3);
          
        System.out.println("Car present state :");
        car.printStates();
    }
}