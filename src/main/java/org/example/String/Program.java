package org.example.String;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        String stroka1 = "Hello";
        String str2 = new String();
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str4 = "";
        char[] charMassive = stroka1.toCharArray();
        for (char elem:charMassive){
            System.out.println(elem);
        }
        System.out.println(stroka1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(stroka1.length());
        System.out.println(str4.isEmpty());
        //объединение строк
        String str5 = "hello";
        String str6 = "world";
        String temp = str5 + str6;
        System.out.println(temp);
        String temp1 = str5.concat(str6);
        System.out.println(temp1);
        String temp2 = String.join(" ", str5, str6);
        System.out.println(temp2);
        String str7 = "Kllll";
        char symbol = str7.charAt(0);  //выводим из строки какрй то символ
        System.out.println(symbol);
        char[] charMAs = new char[2];
        str7.getChars(0, 2, charMAs, 0); // выводим несколько символов
        System.out.println(charMAs);
        String str8 = "hello";
        String str9 = "hello";
        boolean compare;
        //compare = str8.equals(str9);

        String str8_1 = str8.toLowerCase();
        String str9_1 = str9.toLowerCase();
        String str8_2 = str8.toUpperCase();
        String str9_2 = str9.toUpperCase();

        //compare = str8_2.equals(str9_2);
        compare = str8.equalsIgnoreCase(str9); //данный метод позволяет сравниввать строки несмотря на их регистр
        System.out.println(compare);
        String str10 = "Hello w";
        String str11 = "I love you";
        compare = str11.regionMatches(3, str10, 2, 4);
        System.out.println(compare);
        String str12 = "Hello";
        String str13 = "Help";
        String str14 = "Hell";
        String str15 = "hello";
        System.out.println(str12.compareTo(str13));
        System.out.println(str12.compareTo(str14));
        System.out.println(str13.compareTo(str14));
        String str16 = "Hello world";
        int tem = str16.indexOf("w"); //выодит индекс элемента
        int num2 = str16.lastIndexOf("l");

        System.out.println(tem);
        System.out.println(num2);
        String str17 = "mydoc.docx";
        String str18 = "myFriend";
        boolean  start;
        boolean end;
        start = str18.startsWith("my"); //этот метод позволяет понять есть ли указанное в скобках выражение в строке в начале
        end = str18.endsWith("jpg"); //этот метод позволяет понять есть ли указанное в скобках выражение в строке в конце
        System.out.println(start);
        String str19 = "Hello world";
        String str20 = str19.replace("o", "a"); //заменяем один элемент на другой
        System.out.println(str20);
        String str21 = "   Hello     oo  ";
        System.out.println(str21.trim()); //данный метод позволяет убрать отступы в начале и конце
        String str22 = "Hello odppdgjjdodldl";
        String sub1 = str22.substring(4); //метод позволяет пропечатать индекс с указанного символа
        System.out.println(sub1);
        String str23 = "Hello odppdgjjdodldl";
        String sub2 = str23.substring(6, 8); //метод позволяет пропечатать индекс с указанного символа до другого указанного
        System.out.println(sub2);
        String str24 = "iklhrjiukf hjide jfh";
        String words[] = str24.split(" ", 2); //разбивает строку на части. 1 аргумент - символ разделитель 2 агумент-на сколько частей будет разбита строка
        for (String word: words){
            System.out.println(word);
        }







    }
}
