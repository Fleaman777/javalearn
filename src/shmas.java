//import java.util.Scanner;
//
//class shmas {
//
//    public static void main(String[] args) {
//        int i =0;
//        System.out.println("введи число 1, 2 или 3");
//        Scanner scan = new Scanner(System.in);
//        int j = scan.nextInt();
//        if (j == 1) {
//            System.out.println("Твое число" + " " + 1);
//        }
//        if (j == 2) {
//            System.out.println("Твое число" + " " + 2);
//        } if (j==3) {
//            System.out.println("Твое число" + " " + 3);
//        }
//        else {
//            System.out.println("camuy ymnyu?");
//
//            Scanner scan1 = new Scanner(System.in);
//
//
//
//            String k = scan1.nextLine();
//            String xy = "no";
//            String yx = "da";
//
//            if (k == xy) {i++;
//                System.out.println("");
//            }
//            if (k == yx) {i++;
//
//                System.out.println("molodec");
//            }
//            System.out.println(i);
//        }
//    }
//}
//

class UpChar{

    static void UpChar(){

        char chr;

        for (int i=0; i<30; i++){

            chr = (char)('a'+i);

            char CH = (char)((int)chr & 0xffdf);

            System.out.print(CH + " ");
        }
    }

    public static void main(String[] args) {
        UpChar();
    }
}
