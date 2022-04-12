package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    public String tytul;
    public String adres_strony;
    public String adres_grafiki;
    public String adres_miniaturki;
    public String szerokosc;
    public String wysokosc;

    public void print(){
        System.out.printf("\n\nTytul:%s \n",tytul);
        System.out.printf("Adres strony:%s \n",adres_strony);
        System.out.printf("Adres grafiki:%s\n",adres_grafiki);
        System.out.printf("Adres miniaturki:%s\n",adres_miniaturki);
        System.out.printf("Rozmiar :%s x %s \n\n",szerokosc,wysokosc);

    }
    public Infografika(String tekst){
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);
            if(m.find())
                tytul=m.group(1);
            else
                tytul="asd";

        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);
            if(m.find())
                adres_strony=m.group(1);
            else
                adres_strony="";



            pat = Pattern.compile("width=\"(.*)\"\\s*height");
            m = pat.matcher(tekst);
            if(m.find())
                szerokosc=m.group(1);
            else
                szerokosc= "0";

           pat = Pattern.compile("height=\"(.*)\"");
           m = pat.matcher(tekst);
           if(m.find())
                wysokosc=m.group(1);
           else
                wysokosc= "0";

            pat = Pattern.compile("<media:content\\s*url=\"(.*)\"\\s*type");
            m = pat.matcher(tekst);
            if(m.find())
                adres_grafiki=m.group(1);
            else
                adres_grafiki= "0";

            pat = Pattern.compile("<media:thumbnail\\s*url=\"(.*)\"");
            m = pat.matcher(tekst);
            if(m.find())
                adres_miniaturki=m.group(1);
            else
                adres_miniaturki= "0";

                }

}
