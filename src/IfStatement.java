public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 60;

//        var lulusNilai = nilai >= 75;
//        var lulusAbsen = absen >= 75;
//        var lulus = lulusNilai && lulusAbsen;
        if (nilai >= 75 && absen >= 75){
            System.out.println("selamat anda lulus");
        }else if(nilai >= 60 && absen >= 70){
            System.out.println("lulus anda lumayan");
        }else {
            System.out.println("tidak lulus");
        }
    }
}
