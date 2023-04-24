package calisma.nisan01;

public class Loops01 {
    public static void main(String[] args) {

        //1. soru:
        for (int i = 120; i >10 ; i--) {
            if (i%4==0&&i%6==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        //2. soru:
        String s =  "accessories";
        String d = "";
        for (int i = 0; i<s.length();i++){
            String c = s.substring(i, i+1);
            if (s.indexOf(c)!=s.lastIndexOf(c)){
                if (!d.contains(c)){
                    d = d + c;
                }
            }
        }
        System.out.println(d);

        //3. soru:

        String palind = "anna";
        String ters = "";

        for (int i = palind.length()-1; i>-1 ; i--) {
            String c = palind.substring(i , i+1);
            ters = ters + c;

        }
        if(palind.equals(ters)){
            System.out.println(palind + " palindromdur");
        }else{
            System.out.println(palind + " palindrom degildir");
        }
        //4. soru:
        String num = "223878"; //37
        String r = "";

        for (int i = 0; i < num.length(); i++) {
            String c = num.substring(i, i+1);
            if (num.indexOf(c)==num.lastIndexOf(c)){
                r = r + c;
            }
        }
        System.out.println(r);

        //5. soru:
        int rows = 3;
        int colums = 5;
        int i = 1;
        while (i<=rows){
            String a = "";
            for (int k = 1; k<=colums; k++){
                a = a + "A ";

            }
            System.out.println(a);
            i++;

        }while (i<=rows);

        System.out.println();
        //6. soru :

        int r1 = 4;
        for (int k =1 ; k<=r1; k ++){
            String s2 = "";

            for (int j = 1; j <=k; j++) {
                s2 = s2 + "A ";

            }

            System.out.println(s2);
        }



        














    }
}
