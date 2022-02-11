package com.bilgeadam.sayisallotogui;

import java.util.Arrays;
import java.util.Random;

public class SayisalIslem {

    private  static final int MAX_SAYI = 49;
    private static final int KAC_SAYI=6;

    public int rastgeleSayiGetir()
    {
        Random rnd = new Random();
        int sayi = rnd.nextInt(MAX_SAYI)+1;
        return sayi;
    }

    public boolean arraydeVarmı(int[] sayilar,int sayi)
    {
        //Aramak icin binarysearch kullanılır
        //Onun şartıda önce sıralanmıs (yani sort edilmis olması lazım)
        Arrays.sort(sayilar);
        int sonuc = Arrays.binarySearch(sayilar,sayi);

        if (sonuc>= 0)
            return true;
        else
            return false;
    }

    public int[] arrayDoldur()
    {

        int[ ] sayilar = new int[KAC_SAYI];

        int rastgeleSayi = 0;


        for (int i = 0; i <sayilar.length ; i++) {

            rastgeleSayi=rastgeleSayiGetir();

            boolean sonuc = arraydeVarmı(sayilar,rastgeleSayi);
            while (sonuc==true)
            {
                rastgeleSayi = rastgeleSayiGetir();
                sonuc = arraydeVarmı(sayilar,rastgeleSayi);
            }

            sayilar[0]=rastgeleSayi;

        }

        //Son yazdığımız sayıyı 6.sayıyı sıralamak için koyduk
        Arrays.sort(sayilar);
        return sayilar;

    }
}
