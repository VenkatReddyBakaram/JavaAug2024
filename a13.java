class B
{
	B(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
}

class A
{
	public static void main(String args[])
	{
		new B();
		new B(100,200);
		new B(1000,2000);
	}
}