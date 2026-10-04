package classesObjects;

public class Patient {
    String patientName;
    int patientAge;
    String disease;
    int roomNumber;

    void displayPatientDetails()
    {
        System.out.println("Patient name is:"+patientName);
        System.out.println("Patient age is:"+patientAge);
        System.out.println("Patient disease is:"+disease);
        System.out.println("Patient roomnumber is:"+roomNumber);
    }
    void displayPatientSummary() 
    {
        System.out.println("\n--- Patient Summary ---");
        System.out.println(patientName + " is " + patientAge
                + " years old and is being treated for " + disease
                + " in Room " + roomNumber + ".");
    }
    
    double calculateBill(int days, double costPerDay)
    {
        return days * costPerDay;
    }

        public static void main(String[] args)
    {
       Patient pa= new Patient();
       
       pa.patientName="john";
       pa.patientAge=22;
       pa.disease="fever";
       pa.roomNumber=134;

       pa.displayPatientDetails();

       pa.displayPatientSummary();

       int days = 5;
        double costPerDay = 2000;

        double totalBill = pa.calculateBill(days, costPerDay);

        System.out.println("\n--- Hospital Bill ---");
        System.out.println("Days: " + days);
        System.out.println("Cost Per Day: ₹" + costPerDay);
        System.out.println("Total Bill: ₹" + totalBill);
    }
}
