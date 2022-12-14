package Ders44;

import java.util.*;

public class MapDepo {
    // ogrenci map olusturup bize donduren bir method olusturun

    public static Map<Integer, String> ornekMapOlustur(){
        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }

    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {


        String ogrenciValue= ogrenciMap.get(ogrenciKey); // "Ayse-Cem-11-M-TM"

        String[] valueArr=ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]

        String isimSoyisim= valueArr[0]+" "+valueArr[1]; // Ayse Cem

        return isimSoyisim;
    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey, String yeniSube) {


        // ogrenci key map'de var mi ? 104

        if (ogrenciMap.containsKey(ogrenciKey)) {
            // istenen Key varsa, update edip yeni map'i dondurecegiz

            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF
            String[] istenenKeyvalueArr = istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H , MF]
            // yeni sube degerini atayalim
            istenenKeyvalueArr[3] = yeniSube; // // [Ayse, Can, 10, N , MF]

            String istenenKeyinYeniValesu = istenenKeyvalueArr[0] + "-" +
                    istenenKeyvalueArr[1] + "-" +
                    istenenKeyvalueArr[2] + "-" +
                    istenenKeyvalueArr[3] + "-" +
                    istenenKeyvalueArr[4];
            ogrenciMap.put(ogrenciKey, istenenKeyinYeniValesu);
        }

        return ogrenciMap;
    }

    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {

        Collection<String> valueCollection = ogrenciMap.values();
        /*
          [
          Ali-Can-10-H-MF,
          Veli-Cem-11-M-Soz,
          Ali-Cem-11-H-TM,
          Ayse-Can-10-H-MF,
          Ayse-Cem-11-M-TM,
          Fatma-Han-10-K-Soz
          ]
         */
        System.out.println("Isim      Soyisim     Sinif");
        System.out.println("===========================");
        for (String eachValue:valueCollection) {
            // value'yu parcalarina ayir
            String[] valueArr=eachValue.split("-"); // [Ayse, Can, 10, H, MF]

            // sube ismini kontrol et, istenen sube ise isim,soyisim,sinif yazdir
            if (valueArr[3].equals(subeAdi)){

                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2]);
            }
        }
    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {

        //hem Key, hem de value lazim oldugundan keySet'i olusturduk
        // sonra o key uzerinden value'yu map'den aldik
        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();

        // dondurecegimiz listeyi olusturalim
        List<String> isimListesi=new ArrayList<>();

        // Key degerlerini tek tek elden gecirip
        // istenen aralikta olanlari bulalim
        String value;
        String[] valueArr;
        String istenenIsim;
        for (Integer eachKey: ogrenciKeySeti
        ) {

            if (basNo<=eachKey && eachKey<=bitNo){
                // buraya verilen sinir degerlerine uyan
                // eachKey'ler gelecek

                // sinira uygun key'in value'sunu alalim
                value=ogrenciMap.get(eachKey); // Ayse-Can-10-H-MF
                // value'u parcalara ayiralim
                valueArr=value.split("-"); // [Ayse, Can, 10, H, MF]
                // value array'inden listeye eklenecek bilgileri alalim
                istenenIsim= valueArr[0] + " " + valueArr[1]+ " " + valueArr[4];

                // istenen ismi olusturduk, bunu listeye ekleyelim
                isimListesi.add(istenenIsim);
            }
        }

        return isimListesi;
    }



}
