class Vehicle
{
	
	void vehicle_details(String name,String brand,String model)
	{
		System.out.println(name);
		System.out.println(brand);
		System.out.println(model);
	}
}
class Car extends Vehicle //is-a relationship
{
	void car_details(String name,String brand,String model)
	{
		vehicle_details(name,brand,model); // re-usability and reducing duplicate code
	}
} 	
class A
{
	public static void main(String args[])
	{
		
		Car car = new Car();
		car.car_details("Thar","Mahindra","Roxx");			
	}
}	
