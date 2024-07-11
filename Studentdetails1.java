import java.util.*;
class Studentdetails1
          {
          public static void main(String args[])
          {

          //creation of Scanner object

          Scanner sc=new Scanner(System.in);

          int rollno,semester;
          String name,branch;
          float marks;
          char gender;


          System.out.println("Enter the details of student");
          System.out.println("Enter the student name");
          name=sc.nextLine();
          System.out.println("Enter the student branch");
          branch=sc.nextLine();
          System.out.println("Enter the student semester");         
          semester=sc.nextInt();
          System.out.println("Enter the student gender");
          gender=sc.next().charAt(0);
          System.out.println("Enter the student roll number");
          rollno=sc.nextInt();
          System.out.println("Enter the student marks");
          marks=sc.nextFloat();


          System.out.println("student details are:");
          System.out.println("student name:"+name);
          System.out.println("student branch:"+branch);
          System.out.println("student semester:"+semester);
          System.out.println("student gender:"+gender);
          System.out.println("student detalis are:"+rollno);
          System.out.println("student detalis marks:"+marks);
       }
}











          





          
          

 