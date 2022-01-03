package ArraysAlistirma;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		/*
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */
		Scanner scan=new Scanner(System.in);
		System.out.println("toplamini bulmak sitediginiz bir sayi giriniz");
int istenenToplam=scan.nextInt();

int []arr={5,7,-6,4,2,15,3,8,1};
for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if (arr[i]+ arr[j]==istenenToplam) {
			System.out.println(arr[i] + " ile " + arr[j] + "'nin toplami = "+ istenenToplam);
		}
	}
}

	}

}
