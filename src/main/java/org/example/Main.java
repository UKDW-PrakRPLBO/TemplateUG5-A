package org.example;

public class Main {
    public static void main(String[] args) {
        Storage arr = new ArrayListStorage();
        Storage hm = new HashMapStrorage();

        // testing arrayListStorage
        testing(arr);
        // testing hashMapStorage
        testing(hm);
    }

    public static void testing(Storage storage) {
        Mahasiswa mhs = new Mahasiswa("Gian", "71210689", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Yandex", "71210683", "Informatika");
        RegistorMahasiswa rm = new RegistorMahasiswa(storage);
        System.out.println("=== TES INSERT dan DUPLIKASI ===");
        rm.registerMahasiswaBaru(mhs);
        rm.registerMahasiswaBaru(mhs2);
        rm.registerMahasiswaBaru(mhs2);
        System.out.println("");
        rm.printInformasiMahasiswa(mhs.getNim());
        System.out.println();
        rm.printInformasiMahasiswa(mhs2.getNim());

        System.out.println();
        System.out.println("=== TES UPDATE ===");
        rm.updateMahasiswa("71210683", "Yandi", "Informatika");
        rm.updateMahasiswa("71210690", "Yandi", "Informatika");
        System.out.println("");
        rm.printInformasiMahasiswa(mhs.getNim());
        System.out.println();
        rm.printInformasiMahasiswa(mhs2.getNim());

        System.out.println();
        System.out.println("=== TES DELETE ===");
        rm.deleteMahasiswa("71210683");
        rm.printInformasiMahasiswa("71210683");
    }
}
