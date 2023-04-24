package javaders.day22stringbuilder;

public class Sbf01 {
    /*
         1)StringBuffer Java'da String ureten bir Class'dir.
         2)StringBuffer, StringBuilder'a cok benzer, yani ikisi de "mutable" String uretir.
         3)StringBuffer "multi-thread" dir ama StringBuffer "multi-thread" degildir.
         4)Java StringBuffer'i, StringBuilder'dan once olusturdu.
         5)StringBuilder "multi-thread" olmadigi icin StringBuffer'dan daha hizli calisir.
         6)"multi-thread" yapilirkan yapilan islerin siralamasi onam arzeder, yapilan isleri
           mantikli bir siraya koymak "synchronization" olarak adlandirilir,
           StringBuffer "multi-thread" oldugu icin ayni zamanda "synchronized"dir

         3 tane String olusturan Class ogrendik;
         1)immutable string lazimsa; String Class
         2)mutable string lazimsa; StringBuilder vaya StringBuffer
                                   i)StringBuilder'i "multi-thread" gerekmezse kullaniriz.
                                   ii)StringBuffer'i "multi-thread gerekirse kullaniriz.
    */
    public static void main(String[] args) {

        StringBuffer sbf1 = new StringBuffer("Java");





    }
}
