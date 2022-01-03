package ArraysAlistirma;

import java.util.Arrays;

public class Q002 {

	public static void main(String[] args) {
		//multidimensional arrayin ic array lerindeki tum elemanlarin toplamini birer birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdiran program yaziniz.
        //input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

		int[][] arr= {{10,20,30},{4},{6,7,20}};
		int[]arrYeni= new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length; j++) {
				arrYeni[i]+=arr[i][j];
			}
		}
		System.out.println(Arrays.toString(arrYeni));
	}

}
