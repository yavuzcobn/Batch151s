package calisma.arrays;

import java.util.Arrays;

public class Arrays01 {
    //Verilen bir Integer Array'deki en kucuk pozitif elemani ve en buyuk negatif elemani bulunuz
    // Orn : (-12, 18,-5,23,-2)==> en kucuk pozitif 18, en buyuk negatif -2

    public static void main(String[] args) {

        int [] arr = {-12, 18,-5 ,23 ,-2};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int minPositive= arr[arr.length-1];
        int maxNegative= arr[0];

        for (int w : arr ) {
            if (w >=0 )
                minPositive= Math.min(minPositive, w );
            else
                maxNegative= Math.max(maxNegative, w);

        }
        System.out.println("En kucuk pozitif sayi: " + minPositive);//18
        System.out.println("En buyuk negatif sayi: " + maxNegative);//-2

        //2.Yol:

        for (int i = 0; i< arr.length; i++){

            if (arr[i]<0 && arr[i+1]>0){
                maxNegative= arr[i];
                minPositive = arr[i+1];
            }

        }
        System.out.println("En kucuk pozitif sayi: " + minPositive);//18
        System.out.println("En buyuk negatif sayi: " + maxNegative);//-2





    }//main
}//class
