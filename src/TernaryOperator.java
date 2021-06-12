public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Anda Lulus";
        }else {
            ucapan = " Anda Gagal";
        }
        System.out.println(ucapan);

        //Ternary Operator
        var absen = 75;
        String hadir = absen >= 75 ? "Anda Hadir" : "Anda Tidak Hadir";

        System.out.println(hadir);
    }
}
