public class BreakDanContinue {
    public static void main(String[] args) {
        //menggunakan kata kunci break
        var counter = 1;
        while (true) {
            System.out.println("perulangan ke -" + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }
        System.out.println("perulangan berhenti");

        //menggunakan kata kunci continue

        for (int cout = 1; cout <= 100; cout++){
            if(cout % 2 == 0){
                continue;
            }
            System.out.println("perulangan ganjil "+cout);
        }
    }
}
