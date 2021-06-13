public class MethodRecursive {
    public static void main(String[] args) {
        //factorial loop
//        System.out.println(factorialLoop(5));
//
//    }
//    static int factorialLoop(int value){
//        var result = 1;
//        for ( var counter =1; counter <= value; counter++){
//            result *= counter;
//        }
//        return result;

        //menggunakan recursive menthod
//        System.out.println(factorialRecursive(5));
//    }
//    static int factorialRecursive(int value){
//        if(value == 1){
//            return 1;
//        }else {
//            return value * factorialRecursive(value -1);
//        }
//    }

        //stack overflow
        loop(10);
    }
        static void loop(int value) {
            if (value == 0) {
                System.out.println("selesai");
            } else {
                System.out.println("loop " + value);
                loop(value - 1);
            }
        }

}
