package HomeTask2.Task7;

public class Aspirant extends Student{
    String nauchnayaRabota;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String nauchnayaRabota){
        super(firstName, lastName, group, averageMark);
        this.nauchnayaRabota = nauchnayaRabota;
    }


    public void getScholarship() {
        if (super.getAverageMark() >= 4.7) {
            int sum = 5600;
            System.out.println("Аспирант "+ super.getFirstName() + " "+super.getLastName()  + " из группы "+super.getGroup()+ " получает стипендию в "+ sum + " рублей, так как средний балл составляет: "+super.getAverageMark() + ". Научная работа аспиранта: "+nauchnayaRabota);
        } else if (super.getAverageMark()<4.7 && super.getAverageMark()>=3.7) {
            int sum =  3300;
            System.out.println("Аспирант "+ super.getFirstName() + " "+super.getLastName()  + " из группы "+super.getGroup()+ " получает стипендию в "+ sum + " рублей, так как средний балл составляет: "+super.getAverageMark()+nauchnayaRabota + ". Научная работа аспиранта: "+nauchnayaRabota);
        }
        else{int sum = 0;
            System.out.println("Аспирант "+ super.getFirstName() + " "+super.getLastName()  + " из группы "+super.getGroup()+ " получает стипендию в "+ sum + " рублей, так как средний балл составляет: "+super.getAverageMark() + ". Научная работа аспиранта: "+nauchnayaRabota);}
    }



}
