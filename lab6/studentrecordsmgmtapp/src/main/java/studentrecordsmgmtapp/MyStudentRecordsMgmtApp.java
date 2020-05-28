package studentrecordsmgmtapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {

	public static void main(String[] args) {

		Student s1 = new Student("110001", "Dave", 1951, 11, 18);
		Student s2 = new Student("110002", "Anna", 1990, 12, 7);
		Student s3 = new Student("110003", "Erica", 1974, 1, 31);
		Student s4 = new Student("110004", "Carlos", 2009, 8, 22);
		Student s5 = new Student("110005", "Bob", 1990, 3, 5);
		Student[] students = { s1, s2, s3, s4, s5 };
		
		int[]c= {14,25,35,4,5};
		System.out.println("*************************************************************");
				
		printHelloWorld(c);
		System.out.println("*************************************************************");
		
		int[]a= {1,2,3,4,5};
		int[]b= {19,9,11,0,12};
		System.out.println(findSecondBiggest(a));
		System.out.println(findSecondBiggest(b));

		System.out.println("*************************************************************");

		printListOfStudents(students);

		System.out.println("*************************************************************");
		getListOfPlatinumAlumniStudents(students);
		
		
		
	}

	public static void printListOfStudents(Student[] std) {

		List<Student> list = new ArrayList<>();
		for (Student sb : std) {
			list.add(sb);
		}
		List<Student> list2 = list.stream().sorted(Comparator.comparing(Student::getName))
									.collect(Collectors.toList());
		list2.forEach(System.out::println);
	}

	public static void getListOfPlatinumAlumniStudents(Student[] std) {
		List<Student> list = new ArrayList<>();
		for (Student sb : std) {
			list.add(sb);
		}
		List<Student> list2 = list.stream().filter(x -> x.calculateAge(LocalDate.now()) >= 30)
									.sorted(Comparator.comparing(Student::getDateOfAdmission).reversed())
									.collect(Collectors.toList());

		list2.forEach(System.out::println);

	}
	
	/*
	 * 3.5.1. Write a function (or method) named, printHelloWorld, that takes as
	 * input, an array of integers and iterates through them, and it prints the
	 * text, "Hello", if the integer is a multiple of 5. It prints the text,
	 * "World", if the integer is a multiple of 7. And when it encounters an integer
	 * that is a multiple of both 5 and 7, it prints the text, "HelloWorld".
	 */
	 

	
	public static void printHelloWorld(int []arr) {
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%5==0)&&(arr[i]%7==0)) {
				System.out.println("HelloWorld");
			}
			else if(arr[i]%7==0) {
				System.out.println("World");
			}
			else if(arr[i]%5==0) {
				System.out.println("Hello");
		}else {
				System.out.println();
			}
	}
	}
	
	/* 3.5.2. Write code for a method named, findSecondBiggest, which takes as
	 * input, an array of integers and finds and returns the second biggest of the
	 * integers. For example, findSecondBiggest([1,2,3,4,5]) should return 4. And
	 * findSecondBiggest([19,9,11,0,12]) should return 12. (Note: Do not use
	 * sorting).
	 */
	
	
	public static int findSecondBiggest(int[]arr) {
	
	if (arr.length<2) {
		System.out.println("Second Biggest does not exist");
	}
			
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		 for( int i=0;i<arr.length;i++){
             if( arr[i]> firstMax) {
            	 secondMax=firstMax;
             firstMax= arr[i];
             }else if(arr[i]>secondMax) {
            	 secondMax=arr[i];
                 }
		 }
		 return secondMax;
	}
	
	
	
	

}
