package Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentRoll;
	private String studentName;
	private int mobileNumber;
	private String email;
	
	@ManyToOne(cascade = CascadeType.ALL )
//	@JoinColumn(name = "cid")
	@JoinColumn(name="did")
	private Collage clg;

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collage getClg() {
		return clg;
	}

	public void setClg(Collage clg) {
		this.clg = clg;
	}

	public Student(int studentRoll, String studentName, int mobileNumber, String email, Collage clg) {
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.clg = clg;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", clg=" + clg + "]";
	}
	

	
}
