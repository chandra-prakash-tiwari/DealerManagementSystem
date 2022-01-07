package DealerManagementSystem;

import java.util.Scanner;

public class TakeInput {
	public static Scanner Input=new Scanner(System.in);
	
	public static Integer GetInteger() {
		return Input.nextInt();
	}
	
	public static String GetString() {
		return Input.next();
	}
	
	public static Float GetFloat() {
		return Input.nextFloat();
	}
	
	public static Double GetDouble() {
		return Input.nextDouble();
	}
	
	public static Boolean GetBoolean() {
		return Input.nextBoolean();
	}
}
