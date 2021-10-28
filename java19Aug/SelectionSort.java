class SelectionSort {
    public static void main(String[] args){

        int ar[] = {10, 8, 6, 9, 4, 2, 1, 7, 3, 5};

        int i, pos, temp = 0;

        for(i = 0; i < ar.length; i++){
            pos = smallest(ar, i);
            temp = ar[i];
            ar[i] = ar[pos];
            ar[pos] = temp;
        }

        System.out.println("Sorting elements using selection ");

        for(i = 0; i < ar.length; i++){
            System.out.println(ar[i] +",");
        }
    }

    static int smallest(int a[], int p){
        int min = a[p];
        int pos = p;
        for(int i = p+1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
                pos = i;
            }
        }
        return pos;
    }
}
