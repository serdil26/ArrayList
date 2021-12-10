package ArraysAlistirma;

import java.util.Iterator;
import java.util.Random;

public class Arrays1 {

	public static void main(String[] args) {
		/* Bilgisayar 1 ile 100 arasýnda rastgele 10 sayý üretiyor. 
		Üretilen sayýlarý bir dizi içerisine kayýt edin. 
		Sonrasýnda diziye kayýt edilen sayýlarý herhangi bir sýralama algoritmasý ile sýralayýn 
		ve sonrasýnda ekrana çýktý verin. */
		
		int[] arr= new int[10];
		for (int i = 0; i < 10; i++) {
			Random rastgele = new Random();
			int sayi= rastgele.nextInt(100)+1;
			arr[i]=sayi;
			
			}
		for (int k = 1; k < 10; k++) {
			int gecici;
			for (int j = 0; j < 10-k; j++) {
				if (arr[j]>arr[j+1]) {
					gecici=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=gecici;
					
				}
			}
			
		}
		for (int m = 0; m < 10; m++) {
			if (m!=9) {
				System.out.print(arr[m]+"-");
				
			} else 
				System.out.print(arr[m]);
			
		}
		
}
}