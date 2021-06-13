public class ForEach {
    public static void main(String[] args) {
        String[] names ={
                "novan", "fatkhurrohman",
                "java", "flutter",
                "golang", "javascript"
        };
        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        //menggunakan for each
        for (var name : names){
            System.out.println(name);
        }
    }
}
