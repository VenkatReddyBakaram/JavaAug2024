class A
{
	static int a = 200;
	int b = 300;
	
	public static void main(String args[])
	{
	
		A ob = new A();
		
		System.out.println(A.a);
		System.out.println(ob.b);
		System.out.println(ob.a);
		ob.a=500;
		ob.b=600;
		
		System.out.println(A.a);
		System.out.println(ob.a);
		System.out.println(ob.b);
		
		ob=null;
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		
		
	}
}