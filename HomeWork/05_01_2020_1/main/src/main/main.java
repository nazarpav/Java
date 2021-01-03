package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class main {
	static Scanner in;
	public static void Task1() {
		System.out.println("“Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life”\n\t\t\tSteve Jobs");
	}
	public static void Task2() {
		System.out.println("Num: ");
		Float num = in.nextFloat();
		System.out.println("Percent: ");
		Float percent = in.nextFloat();
		Float res = percent/100*num;
		System.out.println("Out: "+res);
	}
	public static void Task3() {
		System.out.println("Enter num1: ");
		String num1 = in.next();
		System.out.println("Enter num2: ");
		String num2 = in.next();
		System.out.println("Enter num3: ");
		String num3 = in.next();
		Integer res = Integer.parseInt(num1+num2+num3);
		System.out.println("Out: " + res);
	}
	public static void Task4() {
		System.out.println("Enter num: ");
		String str=in.next();
		if(str.length()!=6){
			System.out.println("Error");
			return;
		}
		StringBuilder instr = new StringBuilder(str);
		instr.setCharAt(0, str.charAt(4));
		instr.setCharAt(4, str.charAt(0));
		instr.setCharAt(1, str.charAt(5));
		instr.setCharAt(5, str.charAt(1));
		System.out.println("Out: " + instr);
	}
	public static void Task5() {
		System.out.println("Enter num: ");
		Integer num = in.nextInt();
		if(num==1||num==2||num==12){
			System.out.println("Winter");
		}
		else if(num==3||num==4||num==5){
			System.out.println("Spring");
		}
		else if(num==6||num==7||num==8){
			System.out.println("Summer");
		}
		else if(num==9||num==10||num==11){
			System.out.println("Autumn");
		}
		else{
			System.out.println("Error");
		}
	}
	public static void Task6() {
		System.out.println("Enter meters: ");
		Integer num = in.nextInt();
		System.out.println("Convert to:\n\t0: mile\n\t1: inch\n\t2: yard");
		switch (in.nextInt()) {
			case 0:
			System.out.println("mile = " + num * 0.000621371);
				break;
			case 1:
			System.out.println("inch = " + num * 39.3701);
				break;
			case 2:
			System.out.println("yard = " + num * 1.09361);
				break;
			default:
			System.out.println("Error");
				break;
		}
	}
	public static void Task7() {
		System.out.println("Enter begin: ");
		int begin = in.nextInt();
		System.out.println("Enter end: ");
		int end = in.nextInt();
		if(begin>end){
			int tmp = begin;
			begin=end;
			end=tmp;
		}
		else if(begin==end){
			System.out.println("error begin==end");
			return;
		}
		for (int i = begin; i <= end; i++) {
			if(i%2!=0){
				System.out.println(i+"\n");
			}
		}
	}
	public static void Task8() {
		System.out.println("Enter begin: ");
		int begin = in.nextInt();
		System.out.println("Enter end: ");
		int end = in.nextInt();
		for (int i = begin; i <= end; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i+" * "+j+" = "+i*j+"\n");
			}
			System.out.println("###########################");
		}
	}
	public static void Task9() {
		ArrayList<Integer> nums= new ArrayList<Integer>();
		System.out.println("Enter nums: (0 exit)");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int lessZeroCount = 0;
		int aboveZeroCount = 0;
		int zeroCount = 0;
		Random rnd = new Random();
		for (int i = 0; i < 30; i++) {
			int tmp=rnd.nextInt();
			nums.add(i);
			if(max<tmp){
				max=tmp;
			}
			if(tmp>0){
				++aboveZeroCount;
			}
			else if(tmp<0){
				++lessZeroCount;
			}
			else{
				++zeroCount;
			}
		}
		System.out.println("max: "+max+"\nmin: "+min+"\nlessZeroCount: "+lessZeroCount+"\naboveZeroCount: "+aboveZeroCount+"\nzeroCount: "+zeroCount);
	}
	public static void Task10() {
		ArrayList<Integer> nums= new ArrayList<Integer>();
		ArrayList<Integer> even= new ArrayList<Integer>();
		ArrayList<Integer> uneven= new ArrayList<Integer>();
		ArrayList<Integer> lessZero= new ArrayList<Integer>();
		ArrayList<Integer> aboveZero= new ArrayList<Integer>();
		Random rnd = new Random();
		for (int i = 0; i < 30; i++) {
			int tmp=rnd.nextInt();
			nums.add(i);
			if(tmp%2==0){
				even.add(i);
			}
			else{
				uneven.add(i);
			}
			if(tmp>0){
				aboveZero.add(i);
			}
			else if(tmp<0){
				lessZero.add(i);
			}
		}
		for (int val : even){
			System.out.println(val);
		}	
		for (int val : uneven){
			System.out.println(val);
		}	
		for (int val : lessZero){
			System.out.println(val);
		}	
		for (int val : aboveZero){
			System.out.println(val);
		}	
	}
	public static void Task11() {
		System.out.println("Enter length: ");
		int length =in.nextInt();
		System.out.println("Enter dir: 1: ver\n\t *: hor");
		int dir =in.nextInt();
		String symbol = dir==1?"#\n":"# ";
		for (int i = 0; i < length; i++) {
			System.out.print(symbol);
		}
	}
	public static void Task12() {
		int nums[]= new int[30];
		Random rnd = new Random();
		for (int i = 0; i < 30; i++) {
			nums[i]=rnd.nextInt();
		}
		for (int i = 0; i < 30-1; i++) {
        for (int j = 0; j < 30-i-1; j++) 
            if (nums[j] > nums[j+1]) { 
                int temp = nums[j]; 
                nums[j] = nums[j+1]; 
                nums[j+1] = temp; 
			} 
		}
		for (int i = 0; i < 30; i++) {
			System.out.println(nums[i]);
		}
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
		//Task8();
		//Task9();
		//Task10();
		//Task11();
		Task12();
	}

}
