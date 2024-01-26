package org.example.String;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramRegularVariables {
    public static void main(String[] args) {
        /*String str24 = "iklhrjiukf! hjide jfh";
        String words[] = str24.split("\\s*(\\s|,|!|\\.)\\s*"); //разделяет строку на части и убирает занки внутри прямых слешей
        for (String word: words){
            System.out.println(word);
            String phoneNumber = "+88005505355";
            boolean res = phoneNumber.matches("(\\+*)\\d{11}");
            if (res){
                System.out.println("ВВеденная строка является телефонным номером");
            }
            else{
                System.out.println("ВВеденная строка не является телефонным номером");
            }
            //List <String> phoneNumbers = new ArrayList<>();
           // phoneNumbers.add("+88005505355");
           // phoneNumbers.add("+88005588885");
            //String regex = "^((8|\+7)[\- ]?)?(\(?\d{3}\)?[\- ]?)?[\d\-]{7, 10})$";
            //Pattern pattern = Pattern.compile(regex);
            String str = "Hello";
            Pattern pattern = Pattern.compile("Helloззз(\\w*)");
            Matcher matcher = pattern.matcher(str);
            boolean find = matcher.matches();
            while (matcher.find()){
                System.out.println(matcher.group());
            }
            //if (find) {
              //  System.out.println("Совпадение найдено");
           // }
            //else {
             //   System.out.println("совпадение не найдено");
            //}*/
        //String str = "Hello KKHYgffgddgtgg";
        //Pattern pattern = Pattern.compile("Hello(\\w*)");
        //Matcher matcher = pattern.matcher(str);
        //String str1 = matcher.replaceAll("jhyyuuuyu");
        //System.out.println(str1);
        String str = "Hello!.&? KKHYgffgddgtgg"; //закидываем это в массив
        Pattern pattern = Pattern.compile("(\\s?(\\s|,|!|\\?|\\.)\\s*)"); //?-1 символ или отсутсвие симвоов *-vyj;tcndj cbvdjkjd
        //String words[] = str24.split("\\s*(\\s|,|!|\\.)\\s*");
        String[] strs = pattern.split(str);
        for (String tempStr : strs) {
            System.out.println(tempStr);
        }
        System.out.println(link("gmail.com"));
        System.out.println(link("wiki.com"));
        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
        Pattern pattern2 = Pattern.compile(regex);
        Matcher matcher = pattern2.matcher("ggg@mail.com, ffff@gmail.ru");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        List<String> emails = new ArrayList<>();
        emails.add("gggg@mail.ru");
        emails.add("uuuuu@ii.r");
        String regex1 = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern3 = Pattern.compile(regex1);
        for (String email : emails) {
            Matcher matcher1 = pattern3.matcher(email);
            System.out.println(email + matcher1.matches());
        }
        String[] dates = getDate("Hello friend. Im writing you at 15/08/2023");
        System.out.println(dates[0]);

    }
    String[] dates = getDate("Hello friend. Im writing you at 15/08/2023");


    public static boolean link(String str) {
        Pattern pattern1 = Pattern.compile(".+\\.(ru|com)");
        Matcher matcher = pattern1.matcher(str);
        return matcher.matches();
    }

    private static String[] getDate(String str) {
        int count = 0;
        String[] allMatches = new String[2];
        String regex = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";
        Pattern patter = Pattern.compile(regex);
        Matcher matcher = patter.matcher(str);
        while (matcher.find()) {
            allMatches[count] = matcher.group();
            count++;
        }
        return allMatches;
    }

    }





