public class TypeBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInterger = 1000;
        Long iniLong =10L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniObjecr = iniObject.shortValue();
    }
}
