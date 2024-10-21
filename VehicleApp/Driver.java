public class Driver {
    Vehicle car;
    Vehicle bus;
    Vehicle eBike;
    Scanner input = new Scanner(System.in);

    public static void main (String[]args) {

        System.out.printIn("Vehicle App V1.0");
        new Driver();
    }
    public Driver(){
        car = new Vehicle(5,10000,"PLUS","BYD",4);
        car.display();
        bus = new Vehicle(20,140000,"GTX","FORD",8);
        bus.display();
        eBike = new Vehicle(2,5000,"PRO","VW",2);
        eBike.display();
    }

    public void display(){
        System.out.printIn("Vehicle Deatails");
        System.out.print("Make:"+getMake()+",");
        System.out.print("Modle:"+getModle()+",");
        System.out.print("Price:"+getPrice()+",");
        System.out.print("Passengers:"+getPassengers()+",");
        System.out.print("Wheels:"+getNumWheels()+",");

    }
}
