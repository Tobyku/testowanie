package test;

public class Triangle {
	
	private int a,b,c;
	private String temp;
	private String name;
	
	public Triangle()
	{
		a = 0;
		b = 0;
		c = 0;
		name = "";
	}
	
	public Triangle(int a, int b, int c, String name)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.name = name;
	}
	
	int getA()
	{
		return a;
	}
	
	void setA(int a)
	{
		this.a = a;
	}
	
	int getB()
	{
		return b;
	}
	
	void setB(int b)
	{
		this.b = b;
	}
	
	int getC()
	{
		return c;
	}
	
	void setC(int c)
	{
		this.c = c;
	}
	
	String getName()
	{
		return name;
	}
	
	String getTemp()
	{
		return temp;
	}
	
	public double calculateArea()
	{
		return 0.5 * a * b;
	}
	
	public double calculateCircuit()
	{
		return a + b + c;
	}
	
	public Boolean isRectangular() 
	{
		int L = a*a + b*b;
		int P = c*c;
		
		if(L == P)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Boolean isRectangular(int a, int b, int c) 
	{
		int L = a*a + b*b;
		int P = c*c;
		
		if(L == P)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
