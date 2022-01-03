package ArraysAlistirma;

import java.util.Arrays;
import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
		// java programi yazin
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen array'in boyutunu giriniz");
		int arrBoyutu=scan.nextInt();
		
		int arr[]=new int[arrBoyutu];
		
		for (int i = 0; i <arrBoyutu; i++) {
			System.out.println("lutfen " + (i+1)+ ".sayiyi giriniz");
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("en buyuk ve en kucuk elemanin farki:" +(arr[arr.length-1]-arr[0]));
		
	}

}
