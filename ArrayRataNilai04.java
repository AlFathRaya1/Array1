import java.util.Scanner;

public class ArrayRataNilai04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double total = 0;
        double rata1, rata2;
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        int jumlahMahasiswa;
        double total1 = 0 ,total2 = 0;

        System.out.print("Jumlah Mahasiswa : ");
        jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs= new int[jumlahMahasiswa];;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke -"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                total1 = total1 + nilaiMhs[i];
                jumlahLulus++;
        }else {
            total2 = total2 + nilaiMhs[i];
            jumlahTidakLulus++;
            }
        }
        rata1 = total1 / jumlahLulus;
        rata2 = total2 / jumlahTidakLulus ;
        System.out.println("Rata Rata nilai lulus = " +rata1);
        System.out.println("Rata Rata nilai Mahasiswa yang tidak lulus : "+rata2);
    }
}