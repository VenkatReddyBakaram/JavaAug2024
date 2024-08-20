class A
{
	
	void sum()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	
	void sub(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
		
	}
	
	int mul()
	{
		int a=100,b=5;
		int c=a*b;
		return c;		
	}
	
	
	double div(double a, double b)
	{
		return a/b;
	}
	
	
	public static void main(String args[])
	{
	
		A ob = new A();
		ob.sum();
		ob.sub(100,20);
		int res = ob.mul();
		System.out.println(res);
		double r = ob.div(10,3);
		System.out.println(r)	
	}
}