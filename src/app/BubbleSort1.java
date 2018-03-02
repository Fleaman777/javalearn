package app;

public class BubbleSort1 implements BubbleSort {

//    int arr1[] = {1,-3,4,-4,-3,5,6};
    @Override

    public int[] BubbleSort1(int[] arr1) {

    int help;
        for (int a = 0; a<arr1.length; a++){
            for (int b= arr1.length-1; b >a; b--){

                if (arr1[b-1]>arr1[b]){
                    help = arr1[b-1];
                    arr1[b-1]=arr1[b];
                    arr1[b]=help;
                }
            }
        }

    return arr1;
    }
}
