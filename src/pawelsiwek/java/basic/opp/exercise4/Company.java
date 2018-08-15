package pawelsiwek.java.basic.opp.exercise4;

public class Company {
    public static void main (String[] args){
    Employee officeWorker = new Employee();
    Employee itSpecialist = new Employee("Grzegorz","Nowak",1978,20);
    Employee chairman = new Employee("Krzysztof","Bzyczek",1960,34);

    officeWorker.setName("Bozena");
    officeWorker.setSurname("Kowalska");
    officeWorker.setYearOfBird(1950);
    officeWorker.setSeniority(30);
        System.out.println("Imię: "+officeWorker.getName()+" "+"Nazwisko "+officeWorker.getSurname()+" "+"Rok urodzenia"+" "+officeWorker.getYearOfBird()+" "+"Staż pracy "+" "+officeWorker.getSeniority());
        System.out.println("Imię: "+itSpecialist.getName()+" "+"Nazwisko "+itSpecialist.getSurname()+" "+"Rok urodzenia"+" "+itSpecialist.getYearOfBird()+" "+"Staż pracy "+" "+itSpecialist.getSeniority());
        System.out.println("Imię: "+chairman.getName()+" "+"Nazwisko "+chairman.getSurname()+" "+"Rok urodzenia"+" "+chairman.getYearOfBird()+" "+"Staż pracy "+" "+chairman.getSeniority());



    }
}
