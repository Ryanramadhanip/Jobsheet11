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
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("Isi variable z : " + z);
        System.out.println("Isi x sama dengan z (Case Sensitive) : " 
                + x.equals(z));
        
        String r = "operasi";
        System.out.println("Isi variable r : " + r);
        System.out.println("Isi x sama dengan r (Case Sensitive) : "
                + x.equals(r));
        System.out.println("Isi x sama dengan r (Not Case Sensitive) : " 
                + x.equalsIgnoreCase(r));
        
        System.out.println("Perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("Perbandingan isi x dengan z (Case Sensitive): " 
                + x.compareTo(z));
        System.out.println("Perbandingan isi x dengan r (Case Sensitive): " 
                + x.compareTo(r));
        System.out.println("Perbandingan isi x dengan r (Not Case Sensitive) : "
                + x.compareToIgnoreCase(r));
        
        String s = "operasI";
        System.out.println("Isi variable s : " + s);
        System.out.println("Perbandingan isi r dengan s (Case Sensitive) : " 
                + r.compareTo(s));
        
        System.out.println("pada x terdapat huruf 'a' : " + x.contains("a"));
        
        System.out.println("Isi variable x besar semua : " + x.toUpperCase());
        System.out.println("Isi variable x kecil semua : " + x.toLowerCase());
        
        String t = "    operasi string    ";
        System.out.println("Isi variable t : \"" + t + "\"");
        System.out.println("Isi variable t tanpa spasi : \"" + t.trim() +"\"");
        
        System.out.println("Gabungkan isi variable x dan r : " + x.concat(r));
        
    }
}
