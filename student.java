package classesObjects;

public class student {
    String name;
    int rollNumber;
    String course;
    int marks;

    void displayStudentdetails(){
        System.out.println("student name is:"+name);
        System.out.println("student rollNumber is:"+rollNumber);
        System.out.println("student course is:"+course);
        System.out.println("student marks is:"+marks);
        System.out.println("Student grade is: " + calculateGrade());
    }
    String calculateGrade()
    {
        if (marks>=90){
            return "A";
        }
        else if(marks>=75){
            return"B";
        }
        else if(marks>=60){
            return"C";
        }
        else{
            return"D";
        }
    }

    public static void main(String[] args) {
        student std = new student();

        std.name="piyush";
        std.rollNumber=122;
        std.course="BCA";
        std.marks=99;

       
        std.displayStudentdetails();
    }

}
