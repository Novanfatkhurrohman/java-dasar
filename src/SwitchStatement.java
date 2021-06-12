public class SwitchStatement {
    public static void main(String[] args) {


        var nilai = "E";
        switch (nilai)  {
            case "A":
                System.out.println("Anda Lulus dengan nilai terbaik");
                break;
            case "B":
                System.out.println("Anda Lulus dengan baik");
                break;
            case "C":
                System.out.println("Anda lulus dengan Cukup");
                break;
            case "D":
                System.out.println("Nilai Anda Kurang");
                break;
            default:
                System.out.println("Anda Salah Jurusan");
        }

        //switch lamda
        var nilaiKu = "5";
        switch (nilaiKu){
            case "10" -> System.out.println("Nilai Anda Baik");
            case "9", "8" -> System.out.println("Nilai Anda Cukup");
            case "7" -> System.out.println("nilai Anda Kurang");
            default -> {
                System.out.println("Tidak ada nilai");
            }
        }
        //switch dengan kata kunci yeild
        var nilaiSaya = "B";
        String ucapan = switch (nilaiSaya) {
            case "A":
                yield  "Selamat Datang";
            case "B", "C":
                yield "Ohayo";
            case "D":
                yield "goodmorning";
            default:
                yield "Dadah";
        };
        System.out.println(ucapan);
    }
}
