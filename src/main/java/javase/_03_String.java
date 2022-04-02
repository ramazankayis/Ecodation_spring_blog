package javase;

public class _03_String {
    public static void main(String[] args) {

        String kelime = " java full stack  java javase ";

        //kelime =kelime.concat(" and reactjs");
        System.out.println(kelime);
        System.out.println(kelime.length());

      //  String kelime2= "javaSe";
       // System.out.println(kelime.replace(kelime,kelime2));
        //trim: kelimenin sadece başındaki ve sonundaki boşlukları siler
        System.out.println(kelime.length());
        System.out.println(kelime.trim().length());

        //startsWith ==> Bununla mı başlıyor ? evet:true hayır:false
        System.out.println("Bununla mı başlıyor: "+kelime.startsWith("j"));

        //endsWith ==> Bununla mı bitiyor ? evet:true hayır:false
        System.out.println("Bununla mı bitiyor:  "+kelime.endsWith("s"));


        //charAt: sıfır(0) indiste başlar
        //charAt: biz sayı veriririz ilgili indisi bize döndürür
        //charAt: aramalarda sıklıkla kullanılır.
        System.out.println(kelime.charAt(14));

        //indexOf veya lastIndexOf =-1 demek bulamadı anlamına geliyor.
        //indexOf:arama
        System.out.println("soldan arama: "+ kelime.indexOf("java"));

        //lastIndexOf:
        System.out.println("sağdan arama: "+kelime.lastIndexOf("java"));


        //toLowerCase() ==> bütün karakterleri küçük yaz
        System.out.println(kelime.toLowerCase());

        //toUpperCase() ==> bütün karakterleri büyük yaz
        System.out.println(kelime.toUpperCase());

        //String nokta(.) koyarak ilerleyebiliyoruz
        System.out.println(kelime.concat("Mysql").trim().toLowerCase().length());

        //String içeriğinin boş mu dolu mu olup olmadığını anlamak
        System.out.println(kelime.isEmpty());
        System.out.println(!kelime.isEmpty());

        //subString ==> String parçalama yapmak
        String yeniKelime = kelime.substring(4);
        System.out.println(yeniKelime);

        //subString(0,3)
        String yeniKelime2 = kelime.substring(0,3);  //0<=X<=(3-1)
        System.out.println(yeniKelime2);

        //contains: Kelime içinde aradığımız kelime var mı yok mu
        System.out.println(kelime.contains("Html5"));

        //equals: iki farklı String yapı birbirine eşit mi değil mi ?
        String data1="ankara",data2="ANKARA";
        System.out.println("iki farklı kelime eşit mi? "+data1.equals(data2));

        //Büyük küçük harfe bakmaksızın eşit mi değil mi
        System.out.println("iki farklı kelime eşit mi? "+data1.equalsIgnoreCase(data2));

    }
}
