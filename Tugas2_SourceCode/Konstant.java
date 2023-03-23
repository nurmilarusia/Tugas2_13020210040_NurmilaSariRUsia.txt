/*NIM		: 13020210040
NAMA		: NURMILA SARI R. USIA
HARI/TANGGAL	: KAMIS, 16 MARET 2023*/

import java.util.Scanner;
	/* Membaca jari-jari, menghitung luas lingkaran */
	/* latihan pemakaian konstanta */

public class Konstant {
	public static void main(String[] args) {
	final float PHI = 3.1415f;
	float r;
	Scanner masukan=new Scanner(System.in);

	System.out.print ("Jari-jari lingkaran ="); 
	r = masukan.nextFloat();

	System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
	System.out.print ("Akhir program \n");

	}
}