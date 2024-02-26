package com.esma.javalearning;

//Döngüler

public class Loops {
    public static void main(String[] args){

        //for loop

        int[] myNubers={12,54,58,23,11};

        //int x=myNubers[0]/3*5;

        //System.out.println(x);

        //i myNuber.length den küçük olduğu sürece bu işlemi yap
        //ve her dögü bittiğnde i ye bir ekle.
        for (int i = 0; i < myNubers.length; i++){

            int x=myNubers[i]/3*5;
            //System.out.println(x);
        }

        //dizimin içindeki elemanları al ve number diye bir değikene eşitle
        for(int number : myNubers){
            //System.out.println(number/3*5);
        }

        for (int a =0; a < 10; a++){
            int b=a*10;
            //System.out.println(b);
        }

        //while bu olurken şu olurken anlamına gelir. bu bundan küçük olduğu sürece devam et gibi koşullat verebiliyoruz
        int j=0;
        while (j < 10){
            int m=j*10;
            System.out.println(m);
            j++;// bunu yapsak göngü sonsuz olur
        }
    }
}
