public class resh {
//
//    public static void main(String[] args) {
//
//        // часть 1 - создаем матрицу n на n
//        int n = 3;
//        int[][] a = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = n*i + j;
//            }
//        }
//
//        // часть 2 - выводит на экран начальную матрицу
//        System.out.println("Начальная матрица");
//        System.out.println("------");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.printf("%4d", a[i][j]);
//            }
//            System.out.println();
//        }
//
//        // часть 3 - транспонирование матрицы
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                int temp = a[i][j];
//                a[i][j] = a[j][i];
//                a[j][i] = temp;
//            }
//        }
//
//        // часть 4 - выводит на экран транспонированную матрицу
//        System.out.println();
//        System.out.println("Новая матрица");
//        System.out.println("------");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.printf("%3d", a[i][j]);
//            }
//            System.out.println();
//        }
//
//    }
//}


    public int factrec(int nn){
        if (nn==1) return 1;
        return factrec(nn-1)*nn;
    }

    public static void main(String[] args) {
        resh fact1 = new resh();

        System.out.println(fact1.factrec(7));
    }
}