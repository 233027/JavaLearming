package com.esma.javalearning;

public class Statements {

    public static void main(String[] args){

        int x=5;
        System.out.println(x);
        x=x+1;
        System.out.println(x);
        x++;//bir ekleme
        System.out.println(x);
        x--;//bir çıkarma
        System.out.println(x);
        x=x*5;
        System.out.println(x);

        int y=4;
        System.out.println(x>y);
        System.out.println(x<y);

        y=30;
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);//x ve ye eşit değildir


        //and &&
        //or ||

        x = 3;
        y = 4;
        int z = 5;
        System.out.println(x<y && x<z);// and(&&) iki tarafında doğru olması gerek
        System.out.println(x<y && z<y);

        System.out.println(x<y || z<y);// or(||) bir tafın doğru olması yeter bu ya da bu hangisi doğruysa true çıktısını alırsın

        x = 3;
        y = 3;

        //if statement
        if(x < y){
            System.out.println("y is bigger"); // y daha büyük
        }
        else if(y < x){
            System.out.println("x is bigger"); //x daha büyük
        }
        else{
            System.out.println("x=y");
        }

        //switch statement

        int day;
        String dayString="";
        /**
        if(day==1){
            dayString="Monday";
        }
        else if(day==2){
            dayString="Tuesday";
        } else if (day == 3) {
            dayString="Wednesday";
        }
        else{
            dayString="Sunday";
        }

        System.out.println(dayString);
        */
        day=3;
        switch (day){
            case 1://durum
                dayString="Monday";
                break;
            case 2:
                dayString="Tuesday";
                break;
            case 3:
                dayString="Wednesday";
                break;
            default:
                dayString="Sunday";
                break;
        }

        System.out.println(dayString);

    }
}
