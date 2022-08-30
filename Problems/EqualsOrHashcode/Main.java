package Problems.EqualsOrHashcode;



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
    public boolean equals(Object that) {
        if (this == that) {
            return true;// if both are same
        }
        if (that == null || getClass() != that.getClass()) return false;

        Student student = (Student) that;
        return roll == student.roll && marks == student.marks && name.equals(name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
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
        Student s1 = new Student(10,"Ram",500); //roll,name,marks
        Student s2 = new Student(10,"Ram",500); //roll,name,marks
        System.out.println(s1.equals(s2));

        Set<Student> hs = new HashSet<>();
        hs.add(new Student(1,"brajesh",29));
        hs.add(new Student(1,"brajesh",29));
        hs.add(new Student(2,"br",100));

        hs.add(new Student(3,"vicky",50));

        hs.add(new Student(5,"brajesh",29));

        System.out.println(hs.size());
        for(Student i : hs ){
            System.out.println(i);
        }
//        Note: technically at memory level both objects are different, but if we want to make
//        both object s1 and s2 equal logically then we need to override both
//        method inside the Student class.
    }
}
