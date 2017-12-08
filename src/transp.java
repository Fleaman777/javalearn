public class transp {

    public static void PrintArr(int[][] arr) {

        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                System.out.print(arr[i][j] + "\t" );
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        int z[][] = {{8,8,8}, {2,3,1},{8,8,8}, {2,3,1}};

        int hgz=z.length;
        int lhz=z[1].length;

        int[][] x = new int[lhz][hgz];

        for (int i = 0; i<lhz; i++){
            for (int j = 0; j<hgz; j++){
                x[i][j]=z[j][i];
            }
        }

        PrintArr(z);
        System.out.println();
        PrintArr(x);

    }
}
