
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int grade;
    private int stdId ;
    public int id=100;
    private String courses;
    private int tutionfee = 600;
    private double totalpay;


    //constructor : to enter fname,lname and grade

    public Student(){
        Scanner StDetails = new Scanner(System.in);
        System.out.print("Enter FirstName:");
        this.firstName = StDetails.nextLine();

        System.out.print("Enter LastName:");
        this.lastName = StDetails.nextLine();

        System.out.print("Enter Grade:");
        this.grade = StDetails.nextInt();

        SetStdId();
        SetCourses();
        System.out.println("Fname: "+firstName+" Laname:"+lastName+" Grade:"+grade+" StudentId:"+ stdId );
        System.out.println(" EnrolledCourses:" + courses);
        Balance();
        Payment();


    }

    //Generating a unique ID with 5 digits
    private void SetStdId(){
        //Grade (two digit) + StdId
        id++;
        this.stdId = Integer.parseInt(grade + "" + id);
    }

    //setting the list of courses
    private  void SetCourses(){
        do {
            System.out.print("Enter course name (Enter Q to exit):");
            Scanner c = new Scanner(System.in);
            String course = c.nextLine();

            if(!course.equals("Q")){
                courses = courses + "\n " + course;
                totalpay = totalpay + tutionfee;

            }
            else {
                break;
            }

        }while (true);

    }

    //view balance
    public void Balance(){
        System.out.println("Total payment: " +totalpay);
    }

    //payment

    public void Payment(){
        System.out.print("Enter paid amount:" );
        Scanner p = new Scanner(System.in);
        double payment = p.nextDouble();
        totalpay = totalpay - payment;
        System.out.println("Thank you for your payment of $: " +payment);
        Balance();
    }




}