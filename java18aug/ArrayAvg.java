public class ArrayAvg {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int total = 0;

        for(int i=0; i<array.length; i++){
        	total = total + array[i];
        }
        float average = total / array.length;
        System.out.format("The average is: " +average);
    }
}