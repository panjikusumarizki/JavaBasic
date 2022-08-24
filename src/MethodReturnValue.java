public class MethodReturnValue {
    public static void main(String[] args) {
        var result1 = sum(300,400);
        System.out.println(result1);

        System.out.println(hitung(50, 100, "+"));
        System.out.println(hitung(50, 100, "-"));
        System.out.println(hitung(50, 100, "salah"));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, int value2, String operasi) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
