class A
{
	A(){
		System.out.println("constructor");
	}
	
	void f1()
	{
		System.out.println("method");
	}
	
	public static void main(String args[])
	{
		A ob = new A();
		A ob2 = new A();
		ob.f1();
		
	}

}