import java.util.Scanner;
public class Main {
    public static void menu(){
        System.out.print("");
        System.out.println("Menu :");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan pengurutan pesanan by nama");
        System.out.println("5. Hitung total pendapatan");
        System.out.println("6. Keluar");
    }
    public static void main(String[] args){
        System.out.println("======QUIZ 2 PRAKTIKUM ASD TI - 1G======");
        System.out.println("Dibuat oleh : Aryo Deva Saputra");
        System.out.println("NIM : 2141720176");
        System.out.println("Absen : 06");
        System.out.println("==============================");
        System.out.println("Sistem Antrian Resto Royal Delish");

        doublelinkedlist dll = new doublelinkedlist();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int pilih;

        do {
            menu();
            System.out.print("Pilih(1-5) : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan data pembeli :");
                    System.out.println("------------------------------");
                    System.out.print("No : Antrian ");
                    int no = sc.nextInt();
                    System.out.print("Nama Customer");
                    String nama = sc2.nextLine();
                    System.out.println("No. Hp");
                    int nohp = sc.nextInt();
                    //addLast(no, nama, nohp);
                break;
                case 2:
                    dll.print();
                    break;
                case 3:
                    //dll.removeFirst();
                    break;
                case 4:
                    //dll.BubbleSort();
                    break;
                case 5:
                    dll.total();


                
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);

    }
}
