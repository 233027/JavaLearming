package com.esma.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//Diziler
public class Arrays {
    public static void main(String[] args){

        //Arrays

        //myStringArray diye bir obje oluştur. Bu objenin tipi String
        //string dizisi ve 3 elemanlı olsun.
        String[] myStringArray = new String[3];

        myStringArray[0]="James"; //dizilerde elemanlar 0.indexten başlar
        myStringArray[1]= "Lars";
        myStringArray[2]= "Kirk";
        System.out.println(myStringArray);
        //Böyle çalıitırırsak  çıktı :" [Ljava.lang.String;@59a6e353 " bu  olur.
        System.out.println(myStringArray[0]);

        //Aynı anda binlerce string , int gibi değerler alabiliriz
        // tek tek tanımlamak yerine dizileri kullanmayı tercih ederiz.

        int[] myInatgerArray= new int[3];
        myInatgerArray[0]=50;
        myInatgerArray[1]=60;
        myInatgerArray[2]=70;

        // eğer dördüncü bir dizi elemanı tanımlarsam
        //"ArrayIndexOutOfBounds" hatasını alırım.
        //ArrayIndexOutOfBounds : Dizininz sınırlarınız dışına taştı hatası
        //myInatgerArray[3]=80;

        System.out.println(myInatgerArray[1]);

        int[] myNumber = {1,2,3,4,5,6,7,8};
        System.out.println(myNumber[2]);


        //Lists

        ArrayList<String> myMusicians= new ArrayList<String>();
        //ArrayList<değişken tipi> myMusicians= new ArrayList<String>(buraya sayı değişken sayısını yazmamızı istemiyor)

        myMusicians.add("James");// dizinin içine değiken eklemek için değişken adını yazıp add demeliyiz
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");//hangi indexe handi elemenı ekleyeceğimizi belirleriz. Lars Kirk den önce ekli olmasına rağmen ilk Kirk eklenir.
        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        System.out.println(myMusicians.size());

        //Set
        //Dizi gibi ama bir eleman içerisinde sadece bir kere yer alabiliyor.
        //Örneğin; iki tane aynı ismi ekledim kabul etmiyor.

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("James");
        mySet.add("James");
        mySet.add("esma");
        mySet.add("esma");

        System.out.println(mySet.size());// dizide kaç elaman var onu gösterir. iki tane James yazdık ama bir tane döndürücek.

        //HashMap
        //<> arasına ArrayListe ki gibi tek değişken değil , biri
        //anahtar kelime biri değer olmak üzere bizden iki değişken istiyor

        HashMap<String, String> myHashMap= new HashMap<String,String>();

        myHashMap.put("name", "James");//add değil put deriz HashMap kullanırken.
        //İnternetten veri çekerken kullanıcaz.
        myHashMap.put("instrument", "Guitar");

        System.out.println(myHashMap.get("name"));//ekrana yazarken sadece anahtar kelimeyi yazıyoruz.Yanlış yazarsak gelmez
        System.out.println(myHashMap.get("instrument"));

        //Inteager yerine int yazarsak "primitive type" gibi bir hata
        //alırız.HashMap ArrayList HashSet bunları yazarken hep büyük
        //harf kullandık. int bir sınıf olarak objeyi oluşturmak yerine
        //ilkel bir tip olarak oluşturuyor ki daha az yer tutsun.
        //O yüzden Inteager yazmalıyız.

        HashMap<String, Integer> mySecondMap= new HashMap<String, Integer>();
        mySecondMap.put("run",100);
        mySecondMap.put("basketball",200);

        System.out.println(mySecondMap.get("run"));




    }
}
