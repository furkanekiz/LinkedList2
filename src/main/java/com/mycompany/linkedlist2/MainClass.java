/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.linkedlist2;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author use
 */
public class MainClass {
    public static void listeyiBastir(LinkedList<String> gidilecekYerler) {
        /*for (String s : gidilecekYerler) {
            System.out.println(s);
        }*/

        ListIterator<String> iterator = gidilecekYerler.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void siraliEkle(LinkedList<String> gidilecekYerler, String yeni) {
        ListIterator<String> iterator = gidilecekYerler.listIterator();

        while (iterator.hasNext()) {
            int karsilastir = iterator.next().compareTo(yeni);

            if (karsilastir == 0) {
                //iki deger eşit
                System.out.println("Listenizde bu eleman zaten var.");
                return;
            } else if (karsilastir < 0) {
                //Yeni deger iterator.next() den daha buyuk.
            } else if (karsilastir > 0) {
                iterator.previous();
                iterator.add(yeni);
                return;
            }
            System.out.println("bakildi");//**While dongusu her defasında kac kez donuyor gormek icin
        }
        System.out.println("-----");//**ayrac
        iterator.add(yeni);
    }
    public static void main(String[] args) {
        LinkedList<String> gidilecekYerler = new LinkedList<String>();

        siraliEkle(gidilecekYerler, "C");
        siraliEkle(gidilecekYerler, "B");
        siraliEkle(gidilecekYerler, "A");
        siraliEkle(gidilecekYerler, "E");
        siraliEkle(gidilecekYerler, "D");

        listeyiBastir(gidilecekYerler);

        /*gidilecekYerler.add("Postane");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kütüphane");
        gidilecekYerler.add("Spor Salonu");
        gidilecekYerler.add("Ev");

        listeyiBastir(gidilecekYerler);
        
        System.out.println("-----------------------------------");
        
        //gidilecekYerler.add(4,"AVM");
        gidilecekYerler.remove(3);
        listeyiBastir(gidilecekYerler);*/
    }
}
