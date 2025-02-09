import java.util.Scanner;

class ArrayAritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi array dengan tipe data int
        int[] intArray = new int[5];
        System.out.println("Masukkan 5 angka untuk array tipe int:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            intArray[i] = scanner.nextInt();
        }

        // Deklarasi array dengan tipe data double
        double[] doubleArray = new double[5];
        System.out.println("\nMasukkan 5 angka untuk array tipe double:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            doubleArray[i] = scanner.nextDouble();
        }

        // Perhitungan pada array int
        int sumInt = 0;
        for (int num : intArray) {
            sumInt += num;
        }
        double avgInt = (double) sumInt / intArray.length;

        // Perhitungan pada array double
        double sumDouble = 0;
        for (double num : doubleArray) {
            sumDouble += num;
        }
        double avgDouble = sumDouble / doubleArray.length;

        // Menampilkan hasil
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Array int: ");
        System.out.println("  Jumlah: " + sumInt);
        System.out.println("  Rata-rata: " + avgInt);

        System.out.println("Array double: ");
        System.out.println("  Jumlah: " + sumDouble);
        System.out.println("  Rata-rata: " + avgDouble);

        scanner.close();
    }
}
