package com.jaggu;

interface Shape{
	double RATR=5.0000; 
	public int jaav() ;
}

public class Hello implements Shape {

	public static void main(String[] args) {
		Shape s=new Hello();
		System.out.print(Shape.RATR+" "+s.jaav());
		

	}

	@Override
	public int jaav() {
		int sum=45+45;
		return sum;
	}

}
