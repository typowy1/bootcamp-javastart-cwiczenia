package cwiczenia.lekcja2_i_3;

public class OperatoryLogiczneKoniunkcjaAlternatywa {

    public static void main(String[] args) {
        double x = 20;
        double y = 15;
        double z = 10;
        double sumXAndZ = x + z;
        double subtractionYAndZ = y - z;
        double multiplicationXAndY = x * y;
        double odwrotnoscIlorazuXAndY = 1 / (z / x); // 10 / 20 = 1/2 i odwrotnością 1/2 jest 2, dlatego pierw dajemy 1 /


        System.out.println("x > y || y > z: " + (x > y || y > z)); // true
        System.out.println("x > y && x > z: " + (x > y && x > z)); // true
        System.out.println("x + z >= y: " + (sumXAndZ >= y));// true
        System.out.println("y - z < x: " + (subtractionYAndZ < x));// true
        System.out.println("x * y != z: " + (multiplicationXAndY != z));// true
        System.out.println("x * y > 1/z / x: " + (multiplicationXAndY > odwrotnoscIlorazuXAndY));// true
        System.out.println(odwrotnoscIlorazuXAndY);// 2.0

        // można też wyniki przypisać do zmiennej boolen
        boolean result1 = (x > y || y > z);
    }
}
