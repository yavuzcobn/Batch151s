package calisma.day0103;

import java.util.Arrays;

public class C15Arrays {
    public static void main(String[] args) {

        int[] ar = {1, 2, 3};

        int[] yen = new int[ar.length];
        int idx = 0;

        for (int i = 1; i < ar.length; i++) {
            yen[idx] = ar[i];
            idx++;
        }
        yen[ar.length - 1] = ar[0];

        System.out.println(Arrays.toString(yen));

        int toplam = 0;

        for (int w : ar){
            toplam = w + toplam;

            w++;
        }
        System.out.println(toplam);

        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum +ar[i];
      }
        System.out.println(sum);

    }
}
