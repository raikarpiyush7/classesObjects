package classesObjects;

public class car {
    String brand;
    String model;
    long rentPerDay;
    int numberOfDays;

    void displayCarDetails(){
        System.out.println("Brand of the car:"+brand);
        System.out.println("Model of the car:"+model);
        System.out.println("Rentperday of the car:"+rentPerDay);
        System.out.println("numberofdays of the car:"+numberOfDays);
        System.out.println("Total rent of the car:"+calculateRent());

    }
    long calculateRent(){
        return rentPerDay*numberOfDays;
    }
    public static void main(String[] args) {

        //first car
        car c1=new car();

        c1.brand="BMW";
        c1.model="M4";
        c1.rentPerDay=10000;
        c1.numberOfDays=5;

        c1.displayCarDetails();
        System.out.println();

        // second car

        car c2=new car();

        c2.brand="AUDI";
        c2.model="v11";
        c2.rentPerDay=20000;
        c2.numberOfDays=2;

        c2.displayCarDetails();
        System.out.println();

        //third car
        
        car c3=new car();

        c3.brand="swift";
        c3.model="b221";
        c3.rentPerDay=30000;
        c3.numberOfDays=3;

        c3.displayCarDetails();
        System.out.println();

    }
}
