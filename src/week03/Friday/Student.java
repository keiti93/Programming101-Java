package week03.Friday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	public String name;
	public int grade;


public Student(String name, int grade){
	this.name = name;
	this.grade=grade;
}

public Student(){}

public String toString(){
	return this.name + ": " + this.grade;
}

public static void main(String[] args){
	List<Student> students = new ArrayList<>();
	students.add(new Student("Gosho", 4));
	students.add(new Student("Pesho", 5));
	students.add(new Student("Ivan", 5));
	students.add(new Student("Kalin", 2));
	
	Collections.sort(students);
	System.out.println(students.toString());
	

	}

@Override
public int compareTo(Student s) {
	int compare =Integer.compare(this.grade, s.grade) ;
	if (compare==0){
		compare = this.name.compareTo(s.name);
	}

	return compare;
}}