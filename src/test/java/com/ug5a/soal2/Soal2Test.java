package com.ug5a.soal2;

import org.junit.Assert;
import org.junit.Test;

public class Soal2Test {
    Sepatu s1 = new Sepatu("Adidas Ultraboost", 42, 2000000, 10);
    Sepatu s2 = new Sepatu("Nike Air Max", 43, 1500000, -5);
    Sepatu nikeA = new Sepatu("Nike Air Jordan 1 High OG",40,3500000,5);
    Sepatu nikeB = new Sepatu("Nike Blazer",38,750000,10);
    Sepatu nikeC = new Sepatu("Nike SB Dunk Low J-Pack Shadow",36,1300000,2);
    @Test
    public void testConstructor() {
        // Test valid constructor
        Assert.assertEquals("NK00245106", s1.getKode());
        Assert.assertEquals("Adidas Ultraboost", s1.getMerkModel());
        Assert.assertEquals(42, s1.getUkuran());
        Assert.assertEquals(2000000, s1.getHarga());
        Assert.assertEquals(10, s1.getStok());

        // Test negative stock
        Assert.assertEquals("NK00245107", s2.getKode());
        Assert.assertEquals("Nike Air Max", s2.getMerkModel());
        Assert.assertEquals(43, s2.getUkuran());
        Assert.assertEquals(1500000, s2.getHarga());
        Assert.assertEquals(-5, s2.getStok());
    }

    @Test
    public void testGettersSetters() {

        Assert.assertEquals("NK00245103", nikeA.getKode());
        Assert.assertEquals("Nike Air Jordan 1 High OG", nikeA.getMerkModel());
        Assert.assertEquals(40, nikeA.getUkuran());
        Assert.assertEquals(3500000, nikeA.getHarga());
        Assert.assertEquals(5, nikeA.getStok());


        Assert.assertEquals("NK00245104", nikeB.getKode());
        Assert.assertEquals("Nike Blazer", nikeB.getMerkModel());
        Assert.assertEquals(38, nikeB.getUkuran());
        Assert.assertEquals(750000, nikeB.getHarga());
        Assert.assertEquals(10, nikeB.getStok());


        Assert.assertEquals("NK00245105", nikeC.getKode());
        Assert.assertEquals("Nike SB Dunk Low J-Pack Shadow", nikeC.getMerkModel());
        Assert.assertEquals(36, nikeC.getUkuran());
        Assert.assertEquals(1300000, nikeC.getHarga());
        Assert.assertEquals(2, nikeC.getStok());
    }
}
