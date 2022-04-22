package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) 
	{
Calculator obj = new Calculator();
System.out.println("Addition: " + obj.add(10 , 20, 30));
System.out.println("Subtraction: " + obj.sub(5, 3));
System.out.println("Multiplication: " + obj.mul(12.20, 30.21));
System.out.println("Division: " + obj.div(1.2f, 3.2f));
	}

}
