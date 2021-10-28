class EvenOddChecking{
	public static boolean isEven(int number){
		
		if(number%2==0){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args){
		
        boolean oddoreven = isEven(2);
        if(oddoreven==true){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
	}
}