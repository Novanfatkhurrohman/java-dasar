public class MethodReturnValue {
    public static void main(String[] args) {
    var a = 100;
    var b = 100;
    var c = sum(a, b);

        System.out.println(c);
        System.out.println(sum(100, 300));
        System.out.println(hitung(300, "+", 400));
        System.out.println(hitung(200, "-", 150));
        System.out.println(hitung(100, "salah", 50));
    }
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return  0;
        }
    }
}
