package org.example;

public class Task5 {
    public static void main(String[] args) {
        String text = "elene meladze";
        int count = 0;
         for (int i= 0; i < text.length(); i++) {
             char letter = text.charAt(i);
             if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                 count ++;
             }

         }

         System.out.println("ხმოვანი ასოების რაოდენობა:" + count);
         System.out.println( "სტრინგის სიგრძე:" + text.length());
         if (text.length() % 2 ==0 ) {
             System.out.println("ლუწი");
         } else {
             System.out.println("კენტი");
         }
    }

}