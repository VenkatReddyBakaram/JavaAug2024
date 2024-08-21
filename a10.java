class B
{
	
	static void m1()
	{
		//m3(); error
		System.out.println("m1()-static method");
	}
	
	static String getName(){
		return "static-method";
	}
	
	void m2()
	{
		m1(); // we can access, no error
	}
	
	void m3(){
		
		System.out.println("m3()-non static method");
	}
	
}

class A
{
	public static void main(String args[])
	{
			B ob = new B();
			
			B.m1();
			System.out.println(B.getName());
			
			ob.m1();
			System.out.println(ob.getName());
			ob.m2();
	}
}