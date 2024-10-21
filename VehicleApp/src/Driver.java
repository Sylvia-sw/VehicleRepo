import java.util.Scanner;

public class Driver {
    Vehicle car;
    Vehicle bus;
    Vehicle eBike;
    Scanner input = new Scanner(System.in);

    public static void main (String[]args) {

        System.out.println("Vehicle App V1.0");
        Driver driver = new Driver();
        driver.addVehicle();
        driver.printVehicle();
        driver.checkBestVehicle();
    }
    public Driver(){
        car = new Vehicle(5,"BRD","PLUS",10000,4);
        System.out.println(car);
        bus = new Vehicle(20,"FORD","GTX",140000,8);
        System.out.println(bus);
        eBike = new Vehicle(2,"VW","PRO",5000,2);
        System.out.println(eBike);

    }
    public void addVehicle(){
        System.out.print("Enter Passengers:");
        int passengers = input.nextInt();
        System.out.print("Enter Make:");


        String carMake = input.nextLine();
        System.out.print("Enter Model:");
        String model = input.nextLine();
        System.out.print("Enter Price:");

        float price = input.nextFloat();
        System.out.print("Enter NumWheels:");
        int numWheels = input.nextInt();
        car = new Vehicle(passengers,carMake,model,price,numWheels);




    }
    public void printVehicle(){}

    public void checkBestVehicle(){
        System.out.print("Enter Number of Passengers:");
        int numPassengers = input.nextInt();
        System.out.println("Passengers Entered :" + numPassengers);
        if(numPassengers>=1&&numPassengers<=2)
            System.out.println("EBike ia Best:"+eBike.getPassengers() );
        else if(numPassengers>=3&&numPassengers<=5)
            System.out.println("Car ia Best:"+car.getPassengers() );
        else if(numPassengers>=6&&numPassengers<=20)
            System.out.println("Bus ia Best:"+bus.getPassengers() );



    }

}
