public class TypeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "novan";
        arrayString[1] = "fatkhurrohman";
        arrayString[2] = "java";

        System.out.println(arrayString[2]);

        //array initialzer
        int[] arrayInt = new int[]{
                10, 9, 8, 7, 6
        };
        long[] arrayLong = {
                10, 90, 20, 40
        };
        System.out.println(arrayInt[2]);
        System.out.println(arrayLong[3]);

        //oprasi array
        long[] arrayLong1 = {
                10, 20, 30, 40, 50
        };
        arrayLong1[0] = 100;
        System.out.println(arrayLong1[0]);
        System.out.println(arrayLong1[1]);
        System.out.println(arrayLong1.length);

        //array didalam array
        String[][] nameName = {
                {"novan", "fatkhurrohman"},
                {"belajar", "java", "diPNZ"},
                {"ProgrammerZamanNow"}
        };
        System.out.println(nameName[1][2]);
        System.out.println(nameName[1][1]);
        System.out.println(nameName[2][0]);
    }
}
