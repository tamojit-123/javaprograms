class ArrayDemo {

	public static void main(String[] ar) {
		// declaring the array variable with size
		int ageofplayer[] = new int[5];

		// assigining the value of the array element using index
		ageofplayer[0] = 12;
		ageofplayer[1] = 13;
		ageofplayer[2] = 15;
		ageofplayer[3] = 12;
		ageofplayer[4] = 13;

		/*
		 * System.out.println("Age of player[0]="+ageofplayer[0]);
		 * System.out.println("Age of player[1]="+ageofplayer[1]);
		 * System.out.println("Age of player[2]="+ageofplayer[2]);
		 * System.out.println("Age of player[3]="+ageofplayer[3]);
		 * System.out.println("Age of player[4]="+ageofplayer[4]);
		 */

		for (int i = 0; i < ageofplayer.length; i++) {
			System.out.print(ageofplayer[i] + "\t");
		}

	}
}