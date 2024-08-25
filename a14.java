class Furniture
{
	
	void furniture_details(int chairs,int tables)
	{
		System.out.println("Chairs :"+chairs);
		System.out.println("Tables :"+tables);
	}
}

class Room
{
	Furniture furniture = new Furniture(); // has-a relationship
	
	void room_details(int chairs, int tables,String tv)
	{
		furniture.furniture_details(chairs,tables);
		System.out.println("Television :"+tv);	
	}
}
class A
{
	public static void main(String args[])
	{
		Room room = new Room();
		room.room_details(5,5,"LG-Tv");
			
	}
}
	
	