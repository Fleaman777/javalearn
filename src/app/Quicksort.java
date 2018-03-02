package app;

public class Quicksort {
    public static void sort(int[] Arr) {
        quicksort(Arr, 0, Arr.length-1);
    }

    private static void quicksort(int[] Arr, int left, int right) {
        int first, last;
        int centr, value;
        first = left;
        last = right;
        centr = Arr[(left + right) / 2];

        do {
            while ((Arr[first] < centr) && (first < right)) first++;
            while ((centr < Arr[last]) && (left < last)) last--;

            if (first <= last) {
                value = Arr[first];
                Arr[first] = Arr[last];
                Arr[last] = value;

                first++;
                last--;
            }
        } while (first<=last);


            if (first < right) {
                quicksort(Arr, first, right);
            }
            if (left < last) {
                quicksort(Arr, left, last);
            }

    }


}

 class testSort {
     public static void main(String[] args) {
         int[] Arr1 = {1, -3, 4, -4, -2, 8, 6};

         for (int i = 0; i < Arr1.length; i++) {
             System.out.println(Arr1[i]);
         }

         System.out.println(" probel");

         Quicksort.sort(Arr1);
         for (int i = 0; i < Arr1.length; i++) {
             System.out.println(Arr1[i]);
         }

     }
 }
