public class MethodOverloding {
    public static void main(String[] args) {
        sayHello();
        sayHello("novan");
        sayHello("novan", "Java");
    }
    static void sayHello(){
        System.out.println("hello");
    }
    static void sayHello(String name){
        System.out.println("hello " + name);
    }
    static void sayHello(String fistName, String lastName){
        System.out.println("hello " + fistName + " " + lastName);
    }
}
