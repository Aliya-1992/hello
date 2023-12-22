package oop9;

public class Program {
    public static void main(String[] args) {
        Book peaceAndWar = new Book("Peace and War", "Lev Tolstoy", Type.NOVEL);
        System.out.println(peaceAndWar.name + peaceAndWar.author+peaceAndWar.bookType);
        /*switch (peaceAndWar.bookType){
            case HORROR:
                System.out.println("Это ужастик");
            case PHANTASY:
                System.out.println("Это фантастика");
            case CARTOON:
                System.out.println("Это мультик");
            case SCIENCE:
                System.out.println("Это научная фантастика");
            case THRILLER:
                System.out.println("Это триллер");
            case NOVEL:
                System.out.println("Это роман");

        }*/
        Type[] types = Type.values();
        for (Type elem: types){
            System.out.println(elem);
        }
        System.out.println(Type.NOVEL.ordinal()); //показывает какой индекс занимает элемент
    }
}
