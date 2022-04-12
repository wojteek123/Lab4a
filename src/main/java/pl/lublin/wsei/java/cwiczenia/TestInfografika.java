package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.Infografika;

public class TestInfografika {
    public static void main(String[] args) {
        String exItem ="\t\t<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Koniunktura gospodarcza w marcu 2022 r.]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Tue, 22 Mar 2022 16:00:00 +0100]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-marcu-2022-r-,38,69.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-marcu-2022-r-,38,69.html</guid>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/38/69/1/infografika_koniunktura_gospodarcza_03_2022.png\" type=\"image/png\" width=\"2362\" height=\"4548\">\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/69/1/infografika_koniunktura_gospodarcza_03_2022,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t\t</media:content>\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/69/1/infografika_koniunktura_gospodarcza_03_2022,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
                "\t\t</item>";

        Infografika info1= new Infografika(exItem);

        System.out.printf("Tytul:%s \n",info1.tytul);
        System.out.printf("Adres strony:%s \n",info1.adres_strony);
        System.out.printf("Adres grafiki:%s\n",info1.adres_grafiki);
        System.out.printf("Adres miniaturki:%s\n",info1.adres_miniaturki);
        System.out.printf("Rozmiar :%s x %s \n",info1.szerokosc,info1.wysokosc);


    }


}
