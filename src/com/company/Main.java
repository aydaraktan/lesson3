package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String j;
        String a[] = {"azat", "aziz", "shama"};
        Scanner b = new Scanner(System.in);
        System.out.println("здравствуйте  " + a[0] + " " + a[1] + " " + a[2]);
        j = b.nextLine();
        boolean r=true;

            switch(j)
            {
                case "azat":
                    System.out.println("доброе утро " + a[0]);
                    break;
                case "aziz":
                    System.out.println("доброе День " + a[1]);
                    break;
                case "shama":
                    System.out.println("доброе вечер " + a[2]);
            }
        
        String a;
        String[] name=new String[3];
        name[0]="azat";
        name[1]="shama";
        name[2]="noki";
        name = Arrays.copyOf(name, name.length + 1);
        name[3] = "Faruh";
        for (int i = 0; i < name.length; i++){
            switch (i) {
                case 0:
                    System.out.println("доброе утро   "+name[i]);
                    break;
                case 1:
                    System.out.println("добрый день   "+name[i]);
                    break;
                case 2:
                    System.out.println("добрый вечер   "+name[i]);
                    break;
                case 3:
                    System.out.println("доброй ночи   "+name[i]);
                    break;
            }
        }

//        int a[]= {44,55,66};
//        Scanner d = new Scanner(System.in);
//        System.out.println("исходный массив состоящий из 3-х элементов ");
//        for (int i = 0; i < a.length; i++){
//             System.out.println(a[i]);}
//
//        a = Arrays.copyOf(a, a.length + 1);
//        System.out.println("размер массива был увеличен на 1 , введите новое значение для последнего элемента");
//        a[3]= d.nextInt();
//        System.out.println("увеличенный массив");
//        for (int i=0; i<a.length; i++)
//            System.out.println(a[i]);
        }
    }



