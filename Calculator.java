package week1.day2.assignments;

public class Calculator {

	public static void main(String[] args) 
	{
		Calculator obj = new Calculator();
		
		int add = obj.add(2,3,4);
		System.out.println(add);
		
		int sub = obj.sub(6,3);
		System.out.println(sub);
		
		double mul = obj.mul(23.45,32.14);
		System.out.println(mul);
		
		float div = obj.div(4.8F,1.2F);
		System.out.println(div);
		
	}
public int add(int num1, int num2, int num3)
{
	return num1+num2+num3;
}
public int sub(int num1, int num2)
{
	return num1-num2;
}
public double mul(double num1, double num2)
{
	return num1*num2;
}
public float div(float num1, float num2)
{
	return num1/num2;
}
}