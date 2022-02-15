package broken.abstraction1;

public abstract class RestaurantDemo {
	
public abstract void main(String[] args); {
		
		Restaurant obj1 = new Restaurant();
		obj1.location();
		System.out.println(obj1.DISCOUNT);
		
		
		FastFood obj2 = new FastFood();
		obj2.getInfo();
		obj2.setInfo();
		
		FastFood obj3 = new FastFood("John Cena", '12');

		obj3.DISCOUNT = 44.44;

		System.out.println(obj3.dinnerMenu());
		System.out.println(obj3.lunchMenu());
		
}
 



