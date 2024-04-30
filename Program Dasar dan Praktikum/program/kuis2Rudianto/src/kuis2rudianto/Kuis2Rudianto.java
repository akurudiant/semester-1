package kuis2rudianto;
//@author RUDIYANTO
public class Kuis2Rudianto {
//Menampilkan Elemen Array Menggunakan Perulangan
    public static void main(String[] args) {
        String[]JenisBarangElektronik = {"televisi","kulkas","mesin cuci","setrika","kipas angin"};
        
        for (int i=0;i<JenisBarangElektronik.length;i++){
            System.out.println("Jenis Barang Eelektronik "+i+":"+JenisBarangElektronik[i]);
        }  
    }
    
}

