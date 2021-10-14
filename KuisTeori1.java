// Michelle Winardi- 51019016

import java.util.Scanner;

public class KuisTeori1 {
	
	
	public static void main (String args[]){
		
	Scanner input = new Scanner(System.in);
	
	String nama;
	int tiperumah, biayabeban = 0,jumlahmeteran, bayar = 0, totalharga, kembalian;
	
	
	System.out.print("Masukkan Nama Anda : ");
	nama = input.nextLine();
	
	System.out.print("Masukkan Tipe Rumah Anda : ");
	tiperumah = input.nextInt();
	
	System.out.print("Masukkan Jumlah Meteran Pemakaian Rumah Anda : ");
	jumlahmeteran = input.nextInt();

	System.out.println();
	System.out.println();
	
	
	switch (tiperumah){
		case 31 :
			biayabeban = 100000;
		break;
		
		case 32 :
			biayabeban = 125000;
		break;
		
			case 33 :
			biayabeban = 450000;
		break;
		
		case 34 :
			biayabeban = 480000;
		break;
		
			case 35 :
			biayabeban = 500000;
		break;
		
		case 40 :
			biayabeban = 550000;
		break;
		
		default : System.out.println("Tipe Rumah Yang Anda Input Salah");
		break;
		
	}
	
	
	totalharga= (jumlahmeteran*biayabeban);
	
	System.out.println("Total Harga anda : " + totalharga);
	
	
	System.out.print("Masukkan Jumlah Uang Pembayaran : ");
	bayar = input.nextInt();
	System.out.println();
	System.out.println();
	kembalian = (bayar-totalharga);
	

	System.out.println("Nama : " + nama);
	System.out.println("Total Harga : " + totalharga);
	System.out.println("Pembayaran : " + bayar);
	System.out.println("Kembalian : " + kembalian);
	
	 
	}
	 
}
	
		