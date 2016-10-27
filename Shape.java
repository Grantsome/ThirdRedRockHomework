import java.util.Scanner;
import java.math.*;
public class Shape{
	public void calculateArea(){

	}
	public static void main(String args[]){
	Triangle triangle = new Triangle();
	triangle.calcultateArea();
	Square square = new Square();
	square.calcultateArea();
	Circular circular = new Circular();
	circular.calcultateArea();
   }
}

class Triangle extends Shape{
	public void calcultateArea(){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the first side:");
       double a = input.nextDouble();
       System.out.println("Enter the second side:");
       double b = input.nextDouble();
       System.out.println("Enter the first side:");
       double c = input.nextDouble();
       double p = (a + b + c)/2;
       double s = Math.sqrt((p-a)*(p-b)*(p-c)*p);
       System.out.println("The Area of The Triangle is:" + s);
	}
}

class Square extends Shape{
	public void calcultateArea(){
	   Scanner input = new Scanner(System.in);
       System.out.println("Enter the side of Square:");
       float a = input.nextFloat();
       float s = a*a;
       System.out.println("The Area of The Triangle is:"+s);
	}
}

class Circular extends Shape{
	public void calcultateArea(){
	   Scanner input = new Scanner(System.in);
       System.out.println("Enter the radius of Circular:");
       double a = input.nextDouble();
       double s = Const.PI*a*a;
       System.out.println("The Area of The Square is:"+s);
	}
}

class Const{
	private Const(){

	}
	public static final double PI = 3.1415926;
}

