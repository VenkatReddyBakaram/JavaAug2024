class B{
	
	static int b=200;
	
	static 
	{
		System.out.println("static-block1 from helper class -B");
	}
}

class A3
{
	static 
	{
		System.out.println("static-block1 from class A");
		System.out.println("static-block2 from class A");
		System.out.println("static-block3 from class A");
	}
	
	/*static 
	{
		System.out.println("static-block2 from class A");
	}
	
	static 
	{
		System.out.println("static-block3 from class A");
	}*/

	public static void main(String args[])
	{
		System.out.println(B.b);
	}
}