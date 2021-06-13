public class MethodVariableArgument {
    public static void main(String[] args) {

//        int[] values = {80, 80, 80, 80, 80,};
//        sayCongrats("novan",values);
//
//    }
//    static void sayCongrats(String name, int[] values){
//        int total = 0;
//        for( var value : values){
//            total += value;
//        }
//        var finalValue = total/ values.length;
//
//        if(finalValue >= 75){
//            System.out.println("Selamat " + name + ", Anda Lulus");
//        }else {
//            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
//        }
        //dengan kode variable argument


        sayCongrats("novan",80, 80, 80, 80, 80);

    }
    static void sayCongrats(String name, int... values){
        int total = 0;
        for( var value : values){
            total += value;
        }
        var finalValue = total/ values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
