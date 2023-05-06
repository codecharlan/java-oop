public class Bicycle {
    public static void main(String[] args) {

    }
    //attributes
    protected int gear;
    protected int speed;

    //constructor
    public Bicycle(int startSpeed, int startGear){
        gear = startSpeed;
        startGear = speed;
    }
    //create the methods
    public void setGear(int newValue){

        gear = newValue;
    }
    public void applyBrake(int decrementValue){
        speed -= decrementValue;
    }
    public void speedUp(int incrementValue){
        speed += incrementValue;
    }
    //initialize a project

    public void Bicycle(String args){
        //call the constructed class
        Bicycle input = new Bicycle(240, 345);
    }
}
