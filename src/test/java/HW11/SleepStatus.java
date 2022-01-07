package HW11;

public class SleepStatus {

	public static void main(String[] args) {
		
	
		boolean amIsleeping = sleepIn (false, false);
		boolean amIsleeping2 = sleepIn (true,false);
		boolean amIsleeping3 = sleepIn (true,true);
	
		System.out.println(amISleeping);
		System.out.println(amISleeping2);
		System.out.println(amISleeping3);
	}
		public static boolean sleepIn (boolean isWeekday, boolean isVacation){
	
		boolean result = "boolean is Weekday, boolean isVacation";
		
	
			} if (isWeekday == false) {
		
				boolean result = true;
				
			} else if (isWeekday ==false) {
				
				boolean result = false;
				
			} else if (isVacation == false)
	
				boolean result = false;
			
			} else if (isVacation==true) {
				
				boolean result = 'true';
			
			}
					return result;
					

	
	}
	}









// Comment 1. Write a method that takes Boolean parameters
//Method Name: sleepIn
//Method Return Type: boolean
//Parameter 1 = boolean isWeekday
//Parameter 2 = boolean isVacation
//The parameter isWeekday is true if it is a weekday, the parameter isVacation is true if we are on
//vacation. We sleep in if it is not a weekday
//otherwise return false.

//if we are on a vacation. Return true if we sleep in

//Then call your function from main method: Create a Boolean variable in your main method and assign
//the value what sleepIn method returns
//• Variable Name: Boolean amIsleeping;
//Example:
//if pass false, false value then your method should return true
//sleepIn (false, false) → true 
/