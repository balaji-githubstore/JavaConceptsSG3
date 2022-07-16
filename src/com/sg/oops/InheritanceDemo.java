package com.sg.oops;

class Father
{
	public int fAge;
	
	public Father(int fAge)
	{
		this.fAge=fAge;
		System.out.println("Father Constructor");
	}
	
	public void fatherStyle()
	{
		System.out.println("father style!!");
	}
	
	public void demo()
	{
		System.out.println("father demo!!");
	}
}

class Son extends Father
{
	public int sAge;
	
	public Son(int fAge,int sAge)
	{	
		super(fAge);
		this.sAge=sAge;
		System.out.println("Son Constructor");
	}
	
	public void sonStyle()
	{
		System.out.println("Son style!!");
	}
	
	public void demo()
	{
		System.out.println("son demo!!");
	}
	
}

class GrandSon extends Son
{

	public GrandSon(int gAge,int fAge, int sAge) {
		super(fAge, sAge);
		// TODO Auto-generated constructor stub
	}
	public void gsonStyle()
	{
		System.out.println("gSon style!!");
	}
}


public class InheritanceDemo {
	public static void main(String[] args) {
		
//		Father f=new Father();
//		System.out.println(f.fAge);
//		f.fatherStyle();
		
//		Son s=new Son(60, 20);
//		System.out.println(s.fAge);
//		System.out.println(s.sAge);
//		
//		s.fatherStyle();
//		s.sonStyle();
//		s.demo();
		
//		Son s1=new Son(40, 10);
//		System.out.println(s1.fAge);
//		System.out.println(s1.sAge);
		
		Son f=new Son(60, 40);
		f.fatherStyle();
		f.sonStyle();
		
		
		GrandSon g=new GrandSon(0, 0, 0);
		g.fatherStyle();
		g.sonStyle();
		g.gsonStyle();
		
		
	}

}
