class A
{
	int a;
	double d;
	String s;
	boolean flag;
	
	int a1=200;
	double d1=450.50;
	String s1="Java";
	boolean flag1=true;  // instance variables
	
	public static void main(String args[])
	{
		A ob = new A(); // instance memory/object, ob is a reference variable.
		int b=100;
		System.out.println(b);	
		System.out.println(ob);
		
		System.out.println(ob.a);
		System.out.println(ob.d);
		System.out.println(ob.s);
		System.out.println(ob.flag);
		
		System.out.println(ob.a1);
		System.out.println(ob.d1);
		System.out.println(ob.s1);
		System.out.println(ob.flag1);
	}	
}