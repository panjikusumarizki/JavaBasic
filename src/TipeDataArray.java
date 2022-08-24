public class TipeDataArray {
    public static void main(String[] args) {
        String[] arrayString = new String[3];
        arrayString[0] = "Hai,";
        arrayString[1] = "Apa";
        arrayString[2] = "Kabar?";

        arrayString[0] = "Halo,";

        //System.out.println(arrayString[0] + " " + arrayString[1] + " " + arrayString[2]);

        String[] kalimat = new String[]{
                "Hai,", "Lagi", "Apa?"
        };

        long[] arrayLong = {
                10L, 30L, 50L
        };

        //System.out.println(kalimat[0] + " " + kalimat[1] + " " + kalimat[2]);

        //System.out.println(arrayLong[0] + "," + arrayLong[1] + "," + arrayLong[2]);
        //System.out.print(arrayLong.length);

        String[][] members = {
                {"Abdi", "Juni"},
                {"Kelly", "Mikey", "Toro"},
                {"Maudy", "Hany"}
        };

        System.out.println(members[1][0]);
    }
}
