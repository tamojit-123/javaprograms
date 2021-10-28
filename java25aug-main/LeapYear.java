class LeapYear{
	public static boolean isLeapYear(int year){
		if((year%4==0) && (year%100==0) || (year%400==0)){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args){
		LeapYear leapYearObj = new LeapYear();
		boolean leapyear = leapYearObj.isLeapYear(2001);

		if(leapyear){
			System.out.println("leap year");
		}else{
			System.out.println("not leap year");
		}
	}
}