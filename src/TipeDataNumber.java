public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 100000000;
        long iniLong2 = 100000000L;

        float iniFloat = 19.25F;
        double iniDouble = 13.10;

        int decimalInt = 43;
        int hexDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        long balance = 1_000_000_000_000L;
        int sum = 50_000_000;

        // konversi number
        // otomatis
        short iniShortConv = iniByte;
        int iniIntConv = iniShortConv;
        long iniLongConv = iniIntConv;
        float iniFloatConv = iniLongConv;
        double iniDoubleConv = iniFloatConv;

        // manual
        float iniFloatConv2 = (float) iniDoubleConv;
        long iniLongConv2 = (long) iniFloatConv2;
        int iniIntConv2 = (int) iniLongConv2;
        short iniShortConv2 = (short) iniIntConv2;
    }
}
