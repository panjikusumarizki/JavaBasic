public class IfStatement {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 86;

        if (absen >= 85 && nilaiAkhir >= 90) {
            System.out.println("Nilai anda A!");
        } else if (absen >= 75 && nilaiAkhir >= 85) {
            System.out.println("Nilai anda B!");
        } else if (absen >= 65 && nilaiAkhir >= 75) {
            System.out.println("Nilai anda C!");
        } else if (absen >= 55 && nilaiAkhir >= 65) {
            System.out.println("Nilai anda D!");
        } else {
            System.out.println("Nilai anda E!");
        }
    }
}
