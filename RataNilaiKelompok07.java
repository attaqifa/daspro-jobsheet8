import java.util.Scanner;

public class RataNilaiKelompok07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1; 
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            
            int totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
                int nilai = sc.nextInt();
                totalNilai += nilai;
            }

            double rataNilai = totalNilai / 5.0; 
            System.out.println("Rata-rata nilai Kelompok " + i + " = " + rataNilai);
            System.out.println("-----------------------------------");

            i++;
        }

        sc.close();
    }
}
