package com.HashCodeEquals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class HashCodeEquals {
    public static void main(String[] args) {
        Set<Studetn> studetnSet = new HashSet<>();

        studetnSet.add(new Studetn(1,"aman",20));
        studetnSet.add(new Studetn(1,"aman",20));
        studetnSet.add(new Studetn(3,"vicky",21));

        studetnSet.add(new Studetn(2,"brajesh",21));

        System.out.println(studetnSet);

        Studetn st = new Studetn(2,"br",21);
        Studetn st1 = new Studetn(1,"brajesh",20);
        System.out.println(st.equals(st1));

        //        st.printDeail();
    }
}

class Studetn {

    int roll;
    String name;
    int age;

    public Studetn(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.HashCodeEquals.Studetn{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void printDeail(){
        System.out.println(this.roll  + " " + this.name + " " + this.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studetn studetn = (Studetn) o;
        return roll == studetn.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}