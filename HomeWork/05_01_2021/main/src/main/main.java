package main;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
	static Scanner in;
	public static void Task1() {
		System.out.println("Fall seven times\nand\nstand up eight");
	}
	public static void Task2() {
		System.out.println("First: ");
		Integer first = in.nextInt();
		System.out.println("Second: ");
		Integer second = in.nextInt();
		System.out.println("Sum: " + (first+second));
		System.out.println("Sub: " + (first-second));
		System.out.println("Mul: " + first*second);
		System.out.println("Div: " + first/second);
	}
	public static void Task3() {
		System.out.println("Enter num: ");
		String num = in.next();
		num = new StringBuilder(num).reverse().toString();
		System.out.println("Out: " + num);
	}
	public static void Task4() {
		System.out.println("Enter time: ");
		int num = in.nextInt();
		if(num>=0&&num<6) {
			System.out.println("Good Night");
		}
		else if(num>=6&&num<13) {
			System.out.println("Good Morning");
		}
		else if(num>=13&&num<17) {
			System.out.println("Good Day");
		}
		else if(num>=17&&num<0) {
			System.out.println("Good Evening");
		}
	}
	public static void Task5() {
		System.out.println("Enter num: ");
		String num = in.next();
		if((Character.getNumericValue(num.charAt(0))+
		Character.getNumericValue(num.charAt(1))+
		Character.getNumericValue(num.charAt(2)))==(
		Character.getNumericValue(num.charAt(3))+
		Character.getNumericValue(num.charAt(4))+
		Character.getNumericValue(num.charAt(5)))){
			System.out.println("happy");
		}
		else{
			System.out.println("not happy");
		}
	}
	public static void Task6() {
		System.out.println("Enter num: ");
		Integer num = in.nextInt();
		if(num<0||num>100){
			System.out.println("num num>0 || num<100");
		}
		else if(num%3==0&&num%5==0){
			System.out.println("Fizz Buzz");
		}
		else if(num%3==0){
			System.out.println("Fizz");
		}
		else if(num%5==0){
			System.out.println("Buzz");
		}
		else {
			System.out.println(num);
		}
	}
	public static void Task7() {
		System.out.println("Enter num: ");
		int num = in.nextInt();
		if(num==0){
			System.out.println("Result: 0");
		}
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res = res*i;
		}
		System.out.println("Result: "+res);
	}
	public static void Task8() {
		System.out.println("Enter begin: ");
		int begin = in.nextInt();
		System.out.println("Enter end: ");
		int end = in.nextInt();
		boolean isSimple;
		for (int i = begin; i <= end; i++) {
			isSimple=true;
			for (int j = 2; j < i; j++) {
				if(i%j==0){
					isSimple=false;
					break;
				}
			}
			if(isSimple && i > 1){
				System.out.println("Simple: " + i);
			}
		}
	}
	public static void Task9() {
		ArrayList<Integer> nums= new ArrayList<Integer>();
		System.out.println("Enter nums: (0 exit)");
		while(true){
			int num = in.nextInt(); 
			if(num == 0){
				break;
			}
			nums.add(num);
		}
		int sum=0;
		int avg=0;
		for (int val : nums){
			sum +=val;
			System.out.println(val);
		}
		avg = sum/nums.size();
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
	}
	public static void Task10() {
		ArrayList<Integer> nums= new ArrayList<Integer>();
		System.out.println("Enter nums: (0 exit)");
		while(true){
			int num = in.nextInt(); 
			if(num == 0){
				break;
			}
			nums.add(num);
		}
		System.out.println("Enter num: ");
		int num = in.nextInt(); 
		int counter=0;
		for (int val : nums){
			if(val==num){
				++counter;
			}
		}
		System.out.println("Count: " + counter);
	}
	public static void Task11() {
		ArrayList<Integer> nums= new ArrayList<Integer>();
		System.out.println("Enter nums: (0 exit)");
		while(true){
			int num = in.nextInt(); 
			if(num == 0){
				break;
			}
			nums.add(num);
		}
		System.out.println("Enter begin: ");
		int begin = in.nextInt();
		System.out.println("Enter end: ");
		int end = in.nextInt();
		int sum=0;
		for (int i = begin; i <= end; i++) {
			sum+=nums.get(i);
		}
		System.out.println("Sum: " + sum);
	}
	public static ArrayList<Integer> Task12() {
		ArrayList<Integer> nums= new ArrayList<Integer>();
		System.out.println("Enter nums: (0 exit)");
		while(true){
			int num = in.nextInt(); 
			if(num == 0){
				break;
			}
			nums.add(num);
		}		
		ArrayList<Integer> numsRes= new ArrayList<Integer>();

		for (int val : nums){
			int res = 1;
			if(val>0){
				for (int i = 1; i <= val; i++) {
					res = res*i;
				}
			}
			numsRes.add(res);
		}
		for (int val : numsRes){
			System.out.println(val);
		}
		return numsRes;
	}

	public static void main(String[] args) {
		in = new Scanner(System.in);
		//Task1();
		//Task2();
		//Task3();
		//Task4();
		//Task5();
		//Task6();
		//Task7();
		Task8();
		//Task9();
		//Task10();
		//Task11();
		//Task12();
	}

}

