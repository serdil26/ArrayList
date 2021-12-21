package ArraysAlistirma;

import java.util.Arrays;

public class MDArray {

	public static void main(String[] args) {
		// 2 farkli sinifin ogrencilerinin isimlerini icinde tutan 2 boyutlu bir array olusturun
		
		String [][] siniflar=new String[2][5];
		siniflar[0][0]="Sezgin";
		siniflar[0][1]="Hacer";
		siniflar[0][2]="Enes";
		siniflar[0][3]="Harun";
		siniflar[0][4]="Nur";
		
		siniflar[1][0]="Kemal";
		siniflar[1][1]="Sevil";
		siniflar[1][2]="Fatma";
		siniflar[1][3]="Serdar";
		siniflar[1][4]="Murat";
		
		System.out.println(Arrays.toString(siniflar[0]));
		System.out.println(Arrays.toString(siniflar[1]));
		
		//3 farkli sinifta 4 ogrencili bir array olusturun
		
		String [][] siniflar2 = { {"Ali","veli","deli","seli"}, {"enes","recai","harun","resit"}, {"hacer","nur","binnur","emel"} };
System.out.println(Arrays.toString(siniflar2[0]));
System.out.println(Arrays.toString(siniflar2[1]));
System.out.println(Arrays.toString(siniflar2[2]));
System.out.println(siniflar2[2][1]);
	}

}
