import java.util.Scanner;

public class SearchNilai04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int key = 0;
        int hasil = 0;
        int bykNilai;
        int posisi = -1;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        bykNilai = sc.nextInt();
        
        int[] arrNilai = new int[bykNilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i] = sc.nextInt();    
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                posisi = i;
                break;
            }
        }
        System.out.println();
        if (posisi != -1 ) {   
            System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke- "+(posisi+1));
        }else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
            
    }
}