package Problems.Comprator;


//Sorting a List of Student using Comparator (according to the marks);

import java.util.*;

class Student {
    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name, int marks) {
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
class comraretoMark implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMarks()>o2.getMarks())return +1;
        else if(o1.getMarks()<o2.getMarks())return -1;
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(10,"name1",850));
        students.add(new Student(12,"name2",450));
        students.add(new Student(14,"name3",950));
        students.add(new Student(15,"name4",550));
        students.add(new Student(16,"name5",650));


        Collections.sort(students,new comraretoMark());


        for(Student i : students){
            System.out.println(i);
        }
    }


}
