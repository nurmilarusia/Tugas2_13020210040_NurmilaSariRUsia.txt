/*NIM		: 13020210040
NAMA		: NURMILA SARI R. USIA
HARI/TANGGAL	: KAMIS, 16 MARET 2023*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString{
	public static void main (String[] args) throws IOException {
	String str;
	
	BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

	System.out.print ("\nBaca string dan Integer : \n");
	System.out.print ("Masukkan sebuah string : ");
	str=dataIn.readLine();
	System.out.print ("String yang dibaca : " + str);

	}
}