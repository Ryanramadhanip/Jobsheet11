/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek;

import java.util.Locale;

/**
 *
 * @author Ryan Ramadhani
 */
public class CobaOperasiString {
    public static void main(String[] args)
    {
        String identitas = "Ryan Ramadhani / X RPL 2 / 29";
        System.out.println("Identitas : " + identitas);
        
        String x = "Operasi";
        System.out.println("Isi variable x : " + x);
        System.out.println("\"" + x + "\" panjang karakter = " + x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("Isi variable y : " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
    }
}
