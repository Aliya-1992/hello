package org.example.String;

public class ProgramStringBuffer {
    public static void main(String[] args) {
        String str1 = "Hello";
        StringBuffer stringBuffer = new StringBuffer(str1);
        stringBuffer.ensureCapacity(64); //метод позволяет указать какой объем будет у строки
        System.out.println(stringBuffer.capacity()); //данный метод позволяет узнать какой объем занимает строка
        System.out.println(stringBuffer.length()); //данный метод позволяет узнать объем строки
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.charAt(3));
        stringBuffer.setCharAt(4, 'r'); //позволяет изменить определенный символ
        System.out.println(stringBuffer);
        char[] buffer = new char[4];
        stringBuffer.getChars(2, 4, buffer, 0);
        System.out.println(buffer);
        stringBuffer.append("nino"); //метод позволяет добавить подстроку в конец строки
        System.out.println(stringBuffer);
        stringBuffer.insert(3, '*');
        System.out.println(stringBuffer);
        stringBuffer.insert(4, "hjjj"); //метод позволяет добавить подстроку в строку
        System.out.println(stringBuffer);
        stringBuffer.delete(4, 6); //метод позволяет удалить несколько символов
        stringBuffer.deleteCharAt(0);  //метод позволяет удалить 1 символ
        System.out.println(stringBuffer);
        String str2 = stringBuffer.substring(3);
        System.out.println(str2);
        String str3 = stringBuffer.substring(0, 3);
        System.out.println(str3);
        stringBuffer.replace(5, 8, "uuu");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());  //метод позволяет перевернуть строку


    }
}
