package Problems.ApplicationUsingAl;
//Let’s create an application, where user will be prompted to enter the Student details
//        (roll, name, marks) till the user opted out. once he will opted out, then display all the student details back.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class student {
    private int roll;
    private String name;
    private int marks;

    public student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


}
public class Main {
    public static void main(String[] args) {

        List<student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int c = 1;
        while (true){

            System.out.println("Student detail  " + c++);

            System.out.println("roll number");

            int roll = sc.nextInt();
            System.out.println("enter name ");
            String naem = sc.next();
//            System.out.println();
            System.out.println("marsks");
            int marks = sc.nextInt();
            list.add(new student(roll,naem,marks));
            System.out.println(" want more student if yes enter (y)else (n) ");
            String close = sc.next();
            if(close.equalsIgnoreCase("n"));
            break;
        }


        System.out.println("Printing Details of  Students");
        System.out.println("=================================");

        for(student i : list){
            System.out.println(i.getRoll());
            System.out.println(i.getName());
            System.out.println(i.getMarks());
        }
    }
}
