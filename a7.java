class B
{

	int a=100;
	
}

class A
{
	public static void main(String args[])
	{
		B ob = new B();
		System.out.println(ob.a);
		
		ob=null;
		System.out.println("TestPhase-1");
		System.out.println("TestPhase-2");
		System.out.println("TestPhase-3");
		System.out.println("TestPhase-4");
		
		System.out.println(ob.a); //NullPointerException
		
	}
}