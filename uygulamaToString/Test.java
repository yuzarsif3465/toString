package uygulamaToString;

public class Test {
    public static void main(String[] args) {
        //(1) constructor sayesinde nesne kısmına hemen ekleyebiliyoruz
        Ogrenci ogrenci1= new Ogrenci("yusuf");
        // yada bu şekilde  eklemen gerekir ogrenci1.setName("yusuf");

        ogrenci1.setOkul("medeniyet");
        //okulortak oldugundan tek sekilde set edilebilir

        //---2 ogrenci1.bilgileriyaz kısmına ogrenci1 yazma yeterli
        System.out.println(ogrenci1);
    }
}
