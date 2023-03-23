/*NIM		: 13020210040
NAMA		: NURMILA SARI R. USIA
HARI/TANGGAL	: KAMIS, 16 MARET 2023*/

/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */ 

import java.util.Scanner;

public class If1 {
	public static void main(String[] args) {

// TODO Auto-generated method stub
	Scanner masukan=new Scanner(System.in); int a;

	System.out.print ("Contoh IF satu kasus \n"); 
	System.out.print ("Ketikkan suatu nilai integer : "); 
	a = masukan.nextInt();
	if (a >= 0)
	System.out.println ("\nNilai a positif  "+ a);
	
	}
}