/*NIM		: 13020210040
NAMA		: NURMILA SARI R. USIA
HARI/TANGGAL	: KAMIS, 16 MARET 2023*/

import java.util.Scanner;

public class PrintXinterasi {
	public static void main(String[] args) {
	int Sum=0; 
	int x;
	Scanner masukan=new Scanner(System.in);

	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
	x = masukan.nextInt(); 
	if (x == 999){

	System.out.print ("Kasus kosong \n");
	}else{ /* MInimal ada satu data yang dijumlahkan*/
	
	Sum = x; /* Inisialisasi; invariant !! */
	for (;;){
	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");

	x = masukan.nextInt();
	if(x==999)
	break;
	else{
	Sum = Sum + x;
		}
	}

	}
	System.out.println("Hasil penjumlahan = "+ Sum); /* Terminasi */
	}
}