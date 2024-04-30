package kuis;
 //@author RUDIYANTO
import java.util.Scanner;
public class Kuis {
   public static void main (String args[])
   {
        Scanner input=new Scanner(System.in);
   
        System.out.print("Masukan Jumlah Jenis Hewan : ");
        int n=input.nextInt();
        
        //Deklarasi array
        String kata[]=new String[n];
      
        //Input data ke array
        for(int i=0;i<kata.length;i++)
        {
           System.out.print("Kata ke "+(i+1)+" : ");
           kata [i]=input.next();
        }
        //Menampilkan data dalam array
        System.out.println("Jenis-jenis hewan yang dimasukan");
        for(int i=0;i<kata.length;i++)
        {
          System.out.println(kata[i]);
        }
    }
 }