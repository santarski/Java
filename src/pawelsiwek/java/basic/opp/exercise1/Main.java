package pawelsiwek.java.basic.opp.exercise1;

public class Main {
    public static void main(String[] args)
    {
        Person man = new Person("Wojtek", "Bezmojtek", 30, "male");
        Person woman = new Person();
        woman.setName("Wandzia");
        woman.setSurname("Coniechcialaniemca");
        woman.setAge(22);
        woman.setGender("female");
        System.out.println("Meska postac: "+man.getName()+"O nazwisku: "+man.getSurname()+"Latek: "+man.getAge()+"Płeć: "+man.getGender());
        System.out.println("Żeńska postac: "+woman.getName()+"O nazwisku: "+woman.getSurname()+"Latek: "+woman.getAge()+"Płeć: "+woman.getGender());
    }
}
