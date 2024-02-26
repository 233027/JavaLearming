package com.esma.javalearning;

public class Variables {
    public static void main(String[] args){

        //Variables(değişkenler)

        //Integar-Long(tam sayılar)
        int age  =20;

        System.out.println(10*age);
        System.out.println(age/4);

        int x=5;
        int y=11;

        long mylong=10;
        System.out.println(mylong/5);

        System.out.println(y/x);//tam bölünmez 11/5=2,2 çıkar tam sayı olan kısmı alır int tamınladığımız için

        //Double - Float (kesirli sayılar)
        double z=  5.0;
        double a= 11.0;
        System.out.println(a/z);

        float myFloat=10.0f; //  float çok tercih edilmez  çünkü bir sayı yazdığımız zaman double ile ayırmak için sayının sonuna f koymamız lazım hata alıyoruz yoksa
        System.out.println(myFloat/5);

        double  pi=3.14;
        int r=5;
        System.out.println(2*pi*r);

        //String(metin)

        String name = "James";
        String surname =  "Hetfield";
        //name =40 hata!

        System.out.println(name +  " " +surname);

        //Boolean (doğru/yanlış)

        boolean isAlive =true;
        isAlive=false;
        System.out.println(isAlive);


        //Final (değişkeni sabit yapar)
        final int myIntager =  5;
        System.out.println("myIntager: " + myIntager);
        //myIntager=4;--> sabit olduğu için bu kod artık hata verir
        System.out.println("myIntager: " + myIntager);


    }
}
