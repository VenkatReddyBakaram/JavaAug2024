class A
{

	public static void main(String args[])
	{
		
		int a=400; // local variable
		int b; //Ignored by the JVM, because it is not accessing anywhere
		int c=100;
		
		
		System.out.println(a);
	}	
	//System.out.println(c); error, as we cannot access local variable out side of the function
}
/*
1.Local variable must be initialized i.e assigned with some value.
2.Local varialble should be accessed only inside of the function i.e main()
because local variable scope will be with in the function.
3.Though declared local variable and not accessing, then it is ignored by the JVM.
*/

