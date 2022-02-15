package broken.abstraction1;

public abstract class FastFood implements Restaurant {

	public double DISCOUNT;
	protected void location() {
		System.out.println("Reston VA");
	}
	
	public void setOperationTime() {
		System.out.println("24/7");
	}
	
	public void lunchMenu() {
		System.out.println("Time: " + "time");
	}
	
	protected int breakFastmenu() {
		System.out.println("Not serving...");
	}
	
	public void dinerMenu() {
		System.out.println("7PM-10PM");
	}
	
	public void display() {
		
		int discount= (int) (30.00);
		
		int luckyNumber = (int) (22.22);
		
		String waitTime = "NONE";
		
		System.out.println(rating());
	}
	
	
	protected abstract char[] rating();

	public abstract void getInfo();
	public abstract void setInfo();

	protected abstract char[] dinnerMenu();

}
