package person;

public class pInterface {

    public static void main(String[] args) {

        Person person = new Person();

        person.setFirstName("Sanje Lyn");

        person.setLastName("Cinco");

        person.setMiddleName("None");

        person.setAge(21);

        person.setBirthDay("August 30");

        System.out.println("First Name: " + person.getFirstName());

        System.out.println("Last Name: " + person.getLastName());

        System.out.println("Middle Name: " + person.getMiddleName());

        System.out.println("Age: " + person.getAge());

        System.out.println("Birthday: " + person.getBirthDay());

    }
}
