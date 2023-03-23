/*NIM		: 13020210040
NAMA		: NURMILA SARI R. USIA
HARI/TANGGAL	: KAMIS, 16 MARET 2023*/

import java.util.Scanner;

	public class PrintIterasi {
	public static void main(String[] args) {
	int N;
	int i;
	Scanner masukan=new Scanner(System.in);

	System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
	N = masukan.nextInt();
	i = 1; /* First Elmt */

	System.out.print ("Print i dengan ITERATE : \n");
	for (;;){
	System.out.println(i); /* Proses */
	if (i == N)
	break;
	else {
	i++; /* Next Elmt */
		}

		} /* (i == N) */
	}
}