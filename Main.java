public class Main{
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota","Camry", 2022);
        Car c = new Car("Toyota","Camry", 2022,4);
       

        v.displayDetails();
        c.displayDetails();
    
    }
}
