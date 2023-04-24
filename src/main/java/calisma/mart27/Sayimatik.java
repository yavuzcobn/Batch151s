package calisma.mart27;

public class Sayimatik {

    public int kacRakamli;

    public int minSayi;

    public int maksSayi;

    public int [] sayiArray;

    public Sayimatik(int kacRakamli, int minSayi, int maksSayi) {
        this.kacRakamli = kacRakamli;
        this.minSayi = minSayi;
        this.maksSayi = maksSayi;
        biletveyatahminisayilar();
    }

    public void biletveyatahminisayilar(){

        sayiArray=new int[kacRakamli];
        int idx=0;

        do{
            int randomSayi= (int) (Math.random() * ((maksSayi+1) - minSayi) +minSayi);

            int count=0;

            for(int i =0; i<sayiArray.length;i++){

                if(sayiArray[i]==randomSayi){
                    count++;
                }
            }
            if(count==0){
                sayiArray[idx]=randomSayi;
                idx++;
            }

        }while(idx<sayiArray.length);

    }

}

