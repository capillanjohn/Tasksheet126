public class Car extends Vehicle{
    
    int numberOfDoors;

    Car(String make,String model, int year, int numberOfDoors){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Number of Doors: "+ numberOfDoors);
        System.out.println();
    }

}