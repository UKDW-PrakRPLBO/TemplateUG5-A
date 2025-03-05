package com.ug5a.soal1;

                                                    /* !PERINGATAN!
                                            ANDA TIDAK PERLU MENGUBAH CLASS INI*/

public class TransPayMain
{
    public static void main(String[] args) {
        //create TransPay object
        TransPay userA = new TransPay();
        userA.setNama("John Doe");
        userA.setSaldo(500000);

        //create Keyboard object
        Keyboard keyA = new Keyboard();
        keyA.setMerkModel("Digital Alliance Meca Fighter Ice TKL SE");
        keyA.setHarga(250000);

        Keyboard keyB = new Keyboard();
        keyB.setMerkModel("Rexus Daxa M84 Ultimate");
        keyB.setHarga(900000);

        //top up saldo
        System.out.println("==========Skenario 1: Top Up Saldo==========");
        userA.topUp(-50000);
        userA.topUp(1000000);
        System.out.println("===> Total saldo "+userA.getNama()+": "+"Rp "+userA.getSaldo());

        //keyboards purchase
        System.out.println("\n==========Skenario 2: Pembelian Keyboard==========");
        System.out.println("\n"+userA.getNama()+" melakukan pembelian...\n");
        userA.bayar(-5,keyA);
        userA.bayar(2,keyA);
        userA.bayar(1,keyB);
        userA.bayar(5,keyA);
        System.out.println("===> Total saldo "+userA.getNama()+": "+"Rp "+userA.getSaldo());
    }
}

