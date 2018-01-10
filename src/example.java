// class Example {
//
//    void Example(){
//
//        for (int i =0; i<5; i++){
//            if (i==2) return;
//            System.out.println("what is it?");
//        }
//        System.out.println("example example");
//    }
//
//    public static void main(String[] args) {
//        Example book = new Example();
//        book.Example();
//    }
//}
//
//
// class Vehicle{
//     int wheels;
//
//
//
//    Vehicle (int wheelss, int pasengers, int speed, int weight){
//         wheels=wheelss;
//
//    }
//
//     public static void main(String[] args) {
//
//        Vehicle car = new Vehicle(4,4,200,1000);
//        Vehicle bus = new Vehicle(6,30,100,5000);
//
//         System.out.println(car.wheels);
//
//
//     }
//
//
//    }


//class buy{
//        void pay(int money){
//            System.out.println("you pay product by money: " + money);
//    }
//        void pay (String Card){
//            System.out.println(" ypu pay product by card" + "number card: " + Card);
//        }
//}
//
//class ByBuy{
//
//    public static void main(String[] args) {
//
//        buy banana = new buy();
//        buy apple = new buy();
//
//        apple.pay("1234 1234 124 1243");
//
//        banana.pay(100);
//    }
//}


//class Lego{
//
//    int block;
//    int bridge;
//    int people;
//
//    Lego(){
//        this(3,4,1,"Uzi");
//    }
//
//    Lego(int block, int bridge, int people, String gun){
//
//        this.block = block;
//        this.bridge = bridge;
//        this.people = people;
//    }
//}


abstract class Geometry{
    abstract String toStrin();
    abstract double area();

}

class Dot extends Geometry{
    String toStrin(){
        return "Point";
    }
    double area(){
        return 0.0;
    }
}

class Triagle extends Geometry{
    int Cathetus1;
    int Cathetus2;

    String toStrin() {
        return "Trigle";
    }
    Triagle(int Cathetus1, int Cathetus2){
        this.Cathetus1=Cathetus1;
        this.Cathetus2=Cathetus2;
    }

    double area(){
        return (Cathetus1*Cathetus1)/2;

    }
}

class Circle extends Geometry {


    String toStrin() {
        return "Ctrcle";
    }
        int Radius;
    Circle(int Radius){
        this.Radius=Radius;
    }

    double area(){
        return (Radius*Radius)*3.14;
    }
}

class result{
    public static void main(String[] args) {
        Dot dot = new Dot();
        Triagle trigle = new Triagle(3,5);
        Circle circle = new Circle(4);

        double d_area = dot.area();
        double t_area = trigle.area();
        double c_area = circle.area();

        Geometry[] all1={dot,trigle,circle};

        double[] all={d_area,t_area,c_area};

        for (int i =0; i<all.length; i++){
            System.out.println(all[i]);
        }

        System.out.println("  ");

        for (int i = 0; i<all1.length; i++){

            System.out.println(all1[i].toStrin());
            System.out.println(all1[i].area());
        }
    }
}