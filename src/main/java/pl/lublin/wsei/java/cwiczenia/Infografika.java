package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    String tytul;
    String adres_strony;
    String adres_grafiki;
    String adres_miniaturki;
    String szerokosc;
    String wysokosc;

    public Infografika(String tekst){
        Pattern pat = Pattern.compile("<title><!>\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);
            if(m.find())
                tytul=m.group(1);
            else
                tytul="";

        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);
            if(m.find())
                adres_strony=m.group(1);
            else
                adres_strony="";



            pat = Pattern.compile("width=\"(.*)\"height");
            m = pat.matcher(tekst);
            if(m.find())
                szerokosc=m.group(1);
            else
                szerokosc= "0";

           pat = Pattern.compile("width=\"(.*)\"height");
           m = pat.matcher(tekst);
           if(m.find())
                wysokosc=m.group(1);
           else
                wysokosc= "0";

            pat = Pattern.compile("width=\"(.*)\"height");
            m = pat.matcher(tekst);
            if(m.find())
                adres_grafiki=m.group(1);
            else
                adres_grafiki= "0";

            pat = Pattern.compile("width=\"(.*)\"height");
            m = pat.matcher(tekst);
            if(m.find())
                adres_miniaturki=m.group(1);
            else
                adres_miniaturki= "0";

                }

}
