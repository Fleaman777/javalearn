import java.rmi.MarshalException;
import java.util.Scanner;
import java.lang.Math;



public class cikl {
    public static void main(String[] args) {

        String[] v = {"fffff", "dddd", "aaaa","qqqq","aaaa", "ccccc", "xxxx", "eeee"};
        int m=v.length;

        for (int i=0; i<m/2; i++){


            String c=v[i];
            v[i]=v[m-1-i];
            v[m-1-i]=c;

            //v[i]=b;

        }
        for (int i=0; i<m; i++){
            System.out.println(v[i]);
        }


//        int u = 3;
//        int b = 44;
//
//        int h=u;
//        u=b;
//        b=h;
//



//        System.out.println(u==44 && b == 3);



//        int o;
//        {
//            int a;
//            {
//                int b;
//                {
//                    int r;
//                }
//            }
//            int c;
//            {
//                int d;
//            }
//            int j;
//        }

    }
}
