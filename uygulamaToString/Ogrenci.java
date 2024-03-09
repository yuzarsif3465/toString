package uygulamaToString;

public class Ogrenci {
    private static String okul;
    private String name;

    //bu constructor sayesinde her ozellige setName şeklinde eklememiz gerekmez onun yerine nesne de yer ayırırken ozellikleri de içine ekleriz(1)
    public Ogrenci(String name){
        this.name=name;
        Ogrenci.okul=okul;
    }

    public static void setOkul(String okul){
        Ogrenci.okul=okul;
    }
    public static String getOkul(){
        return okul;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    /*public String bilgileriAl(){
        return "okul: "+okul +" isim: "+name;
    }*/

    //to String ise otamatik hazır zaten sadece main kısmında---2


    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                '}';
    }
}
