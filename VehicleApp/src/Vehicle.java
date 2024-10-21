public class Vehicle {

    private int passengers = 5;
    private String make = "ACME Make";
    private String model = "ACME Model";
    private float price = 10000;
    private int numWheels = 5;

    public Vehicle() {
        this.passengers = 5;
        this.make = "ACME Make";
        this.model = "ACME Model";
        this.price = 10000;
        this.numWheels = 5;

    }

    public Vehicle(int passengers, String make, String model,
                   float price, int numWheels) {
        this.passengers = passengers;
        this.make = make;
        this.model = model;
        this.price = price;
        this.numWheels = numWheels;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumWhssls() {
        return numWheels;
    }

    public void setNumWhssls(int numWhssls) {
        this.numWheels = numWhssls;
    }




    public void display(){
        System.out.println("Vehicle Deatails");
        System.out.print("Make:"+getMake()+",");
        System.out.print("Modle:"+getModel()+",");
        System.out.print("Price:"+getPrice()+",");
        System.out.print("Passengers:"+getPassengers()+",");
        System.out.print("Wheels:"+getNumWhssls()+",");

    }


    public String toString() {
        return "Vehicle{" +
                "passengers=" + passengers +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", numWhssls=" + numWheels +
                '}';
    }
} //


