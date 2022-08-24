public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80,80,85,79,90};
        sayCongrats("Panji", values);

        sayCongrats("Kusuma", 85,90,78,80);
    }

    /* static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", anda lulus");
        } else {
            System.out.println("Maaf " + name + ", anda tidak lulus");
        }
    } */

    // menggunakan variable argument
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", anda lulus");
        } else {
            System.out.println("Maaf " + name + ", anda tidak lulus");
        }
    }
}
