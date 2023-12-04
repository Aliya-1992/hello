/*package org.example.tasks;
import java.util.ArrayList;
import java.util.Scanner;


public class Task {
    public static void main(String[] args) {

            //implement me
        ArrayList<String> schet = new ArrayList<>();
            int i;
            for (i = 0; i<10; i=i+1) {
                Scanner sc = new Scanner(System.in);
                String ochki = sc.nextLine();
                schet.add(i, ochki);
                System.out.println(schet);
            }
            String y;
            for (y in schet; );

        }

    }*/




/*Наша футбольная команда завершила чемпионат.

Результаты матчей нашей команды записываются в набор строк. Каждый матч представлен строкой в ​​формате «x:y», где x — результат нашей команды, а y — счет соперника.

Например: ["3:1", "2:2", "0:1", ...]

Очки начисляются за каждый матч следующим образом:

если x > y: 3 очка (победа)
если x < y: 0 очков (проигрыш)
если x = y: 1 очко (ничья)
Нам нужно написать функцию, которая принимает эту коллекцию и возвращает количество очков, которые наша команда (x) набрала в чемпионате по приведенным выше правилам.

Примечания:

наша команда всегда играет 10 матчей в чемпионате
0 <= х <= 4
0 <= у <= 4*/