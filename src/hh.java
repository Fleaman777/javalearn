

class matem {
    public static void kk(int k, int b){
        if( k>b){
            System.out.println(k-b);
        }
        else {
            System.out.println((k+b));
        }
    }
    public static void kk(double k, double b){
        if( k>b){
            System.out.println(k-b);
        }
        else {
            System.out.println((k+b));
        }
    }

    public static void main(String[] args) {
        matem jj=new matem();
        jj.kk(8,2);
        jj.kk(1.3,4.5);


    }
}




