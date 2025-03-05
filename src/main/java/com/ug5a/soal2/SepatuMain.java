package com.ug5a.soal2;

                                                    /* !PERINGATAN!
                                            ANDA TIDAK PERLU MENGUBAH CLASS INI*/

public class SepatuMain {
    public static void main( String[] args ){
        Sepatu nikeA = new Sepatu("Nike Air Jordan 1 High OG",40,3500000,5);
        Sepatu nikeB = new Sepatu("Nike Blazer",38,750000,10);
        Sepatu nikeC = new Sepatu("Nike SB Dunk Low J-Pack Shadow",36,1300000,2);
        System.out.println("\n========== Daftar Sepatu Nike==========\n");
        infoSepatu(nikeA);
        infoSepatu(nikeB);
        infoSepatu(nikeC);
    }
    public static void infoSepatu(Sepatu shoes){
        String kode = shoes.getKode();
        int ukuran = shoes.getUkuran();
        long harga = shoes.getHarga();
        int stok = shoes.getStok();
        String merk = shoes.getMerkModel();
        System.out.println("-----"+merk+"-----");
        System.out.println("Kode: "+kode);
        System.out.println("Ukuran: "+ukuran);
        System.out.println("Harga: Rp"+harga);
        System.out.println("Stok: "+stok);
    }

}
