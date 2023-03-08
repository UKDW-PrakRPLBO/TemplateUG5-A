package com.ug5a.soal1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Soal1Test {
    private TransPay transPay1;
    private TransPay transPay2;
    private Keyboard keyboard1;
    private Keyboard keyboard2;
    private Keyboard keyboard3;

    @Test
    public void transPayTest() {
        //valid
        transPay1 = new TransPay();
        transPay1.setNama("John Doe");
        transPay1.setSaldo(500000);
        Assert.assertEquals(500000, transPay1.getSaldo());
        Assert.assertEquals("John Doe", transPay1.getNama());

        //invalid
        transPay2 = new TransPay();
        transPay2.setNama("Jane Doe");
        transPay2.setSaldo(-100000);
        Assert.assertEquals(0, transPay2.getSaldo());
        Assert.assertEquals("Jane Doe", transPay2.getNama());
    }
    @Before
    @Test
    public void keyboardTest() {
        keyboard1 = new Keyboard();
        keyboard1.setMerkModel("Digital Alliance Meca Fighter Ice TKL SE");
        keyboard1.setHarga(250000);
        Assert.assertEquals(250000, keyboard1.getHarga());
        Assert.assertEquals("Digital Alliance Meca Fighter Ice TKL SE", keyboard1.getMerkModel());

        keyboard2 = new Keyboard();
        keyboard2.setMerkModel("Rexus Daxa M84 Ultimate");
        keyboard2.setHarga(1200000);

        keyboard3 = new Keyboard();
        keyboard3.setMerkModel("Tecware Phantom Spectre Pro");
        keyboard3.setHarga(-1200000);
        Assert.assertEquals(0, keyboard3.getHarga());
        Assert.assertEquals("Tecware Phantom Spectre Pro", keyboard3.getMerkModel());
    }

    @Test
    public void validTopUpTransPayTest() {
        transPay1 = new TransPay();
        transPay1.setNama("John Doe");
        transPay1.topUp(100000);
        Assert.assertEquals(100000, transPay1.getSaldo());

        transPay2 = new TransPay();
        transPay2.setNama("Jane Doe");
        transPay2.topUp(300000);
        Assert.assertEquals(300000, transPay2.getSaldo());
    }

    @Test
    public void invalidTopUpTransPayTest() {
        transPay1 = new TransPay();
        transPay1.setNama("John Doe");
        transPay1.topUp(-100000);
        Assert.assertEquals(0, transPay1.getSaldo());

        transPay2 = new TransPay();
        transPay2.setNama("Jane Doe");
        transPay2.topUp(-50000);
        Assert.assertEquals(0, transPay2.getSaldo());
    }

    @Test
    public void validBayarTransPayTest() {
        // Test successful payment
        transPay1 = new TransPay();
        transPay1.setNama("John Doe");
        transPay1.topUp(500000);
        transPay1.bayar(1, keyboard1);
        Assert.assertEquals(250000, transPay1.getSaldo());

        transPay2 = new TransPay();
        transPay2.setNama("Jane Doe");
        transPay2.topUp(2000000);
        transPay2.bayar(1, keyboard2);
        Assert.assertEquals(800000, transPay2.getSaldo());

    }

    @Test
    public void invalidBayarTransPayTest() {
        transPay1 = new TransPay();
        transPay1.setNama("John Doe");
        transPay1.topUp(500000);
        transPay1.bayar(-1, keyboard1);
        Assert.assertEquals(500000, transPay1.getSaldo());
        transPay1.bayar(3, keyboard1);
        Assert.assertEquals(500000, transPay1.getSaldo());

        transPay2 = new TransPay();
        transPay2.setNama("Jane Doe");
        transPay2.topUp(2000000);
        transPay2.bayar(0, keyboard2);
        Assert.assertEquals(2000000, transPay2.getSaldo());
        transPay2.bayar(1, keyboard2);
        Assert.assertEquals(800000, transPay2.getSaldo());
        transPay2.bayar(1, keyboard2);
        Assert.assertEquals(800000, transPay2.getSaldo());

    }
}
