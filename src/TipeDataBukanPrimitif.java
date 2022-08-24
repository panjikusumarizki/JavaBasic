public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 1000;

        Integer iniObject = iniInt; // konversi dari tipe data primitif ke tipe data bukan primitif

        System.out.println(iniObject);

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(iniFloat);
    }
}
