package main.java;

/*Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
например "Hello world!!!" -> "!!!dlrow olleH"
 */

public class Task5 {
    /*public static void main(String[] args) {
        System.out.println(reverse("Hello world!!!"));
    }*/

    public String reverse(String str) {
        char[] revArray = str.toCharArray();
        String resultStr = "";
        for (int i = revArray.length - 1; i >= 0; i--) {
            resultStr += revArray[i];
        }
        return resultStr;
    }
}
