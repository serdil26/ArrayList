package ArraysAlistirma;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		// Kullanicidan bir metin alalim. metinde kac cumle, kac kelime, kac karakter oldugunu hesaplayan bir prg yazalim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir metin giriniz");
		
		String metin=scan.nextLine();
		
		String[] cumle=metin.split("\\.");
		String[] kelime= metin.split(" ");
		String [] kar=metin.split("");
		
		System.out.println("girdiginiz metinde :" + cumle.length + " adet cumle vardir");
		System.out.println("girdiginiz metinde :" + kelime.length + " adet kelime vardir");
		System.out.println("girdiginiz metinde :" + kar.length + " adet karakter vardir");
		
		System.out.println(cumle[0]);
		System.out.println(cumle[1]);
		System.out.println(cumle[2]);
		System.out.println(cumle[3]);
		System.out.println(cumle[4]);
	}

}
