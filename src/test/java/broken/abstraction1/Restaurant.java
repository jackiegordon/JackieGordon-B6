package broken.abstraction1;

public abstract class Restaurant {

	public final double DISCOUNT = 20.00;
	public int luckyNumber= 12;
	public  int waitTime= 20;
	public String name;
	
	public Restaurant(String name, int luckyNumber, int waitTime) {
	}
		public void name(String name) {
		name = name;
			
		public void luckyNumber() {
		}
		luckyNumber = luckyNumber;
		
		public void waitTime();
		}
		waitTime = waitTime;
		
		
		System.out.println(this.name);
		System.out.println(this.waitTime);
		System.out.println(this.luckyNumber);
	}
	
	
	
	protected abstract void waitTime1();
	public static abstract void location();
	
	public static void setOperationTime() {
		System.out.println("Monday-Friday");
	}
	
	public final abstract void specialMenu();
	
	
	abstract void rating();
	
	public abstract void breakfastMenu();
	
	public abstract void lunchMenu();

	public abstract void dinnerMenu();
}

