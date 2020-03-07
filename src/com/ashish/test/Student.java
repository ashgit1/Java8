package com.ashish.test;

public class Student {
	int id;
	String name;
	
	Student(){}
	
	public static void main(String args[]){
		
		Student stud[] = new Student[100];
		
		for(int i=0; i<stud.length; i++){
			stud[i] = new Student();
			stud[i].id = i+1;
			stud[i].name = "object"+(i+1);
		}
		
		for(int i=0; i<stud.length; i++){
			System.out.println(stud[i].id);
			System.out.println(stud[i].name);
		}
		
	}
}
