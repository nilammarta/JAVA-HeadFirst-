package Exercise2;

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int x = 0;

        while(x < 4) {
            e1.hello();
//            e2.hello();

            e1.count = e1.count + 1;

            if (x > 0){
                e2.count = e2.count + 1;
            }

            if (x > 1){
                e2.count = e2.count + e1.count;
            }

            x = x + 1;
        }
        System.out.println(e2.count);
        System.out.println(e1.count);
    }


    // Shaper pencil hal 52
//    public static void main(String[] args) {
//        byte b = 3;
//        System.out.println(b);
//
//        byte v = b;
//        System.out.println(v);
//
//        int g = 17;
//        int y = g;
//        y = y + 10;
//
//        short s;
//
////        s = y;
//
//        short n = 12;
////        v = n;
//
//        byte k = 128;
//    }
}
