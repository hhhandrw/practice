package ru.ssau.tk.love.idea.typesOfData;

public class Runner {
    public static void main(String[] args) {
        Person firstPerson = new Person();

        firstPerson.setFirstName("Andrey");
        firstPerson.setLastName("Khlebodarov");
        firstPerson.setPassportId(1);

        Person secondPerson = new Person();

        secondPerson.setFirstName("Tom");
        secondPerson.setLastName("Hardy");
        secondPerson.setPassportId(612);

        Person thirdPerson = new Person();

        thirdPerson.setFirstName("Cristiano");
        thirdPerson.setLastName("Ronaldo");
        thirdPerson.setPassportId(7);

        System.out.println(firstPerson.getFirstName());
        System.out.println(firstPerson.getLastName());
        System.out.println(firstPerson.getPassportId());

        System.out.println(secondPerson.getFirstName());
        System.out.println(secondPerson.getLastName());
        System.out.println(secondPerson.getPassportId());

        System.out.println(thirdPerson.getFirstName());
        System.out.println(thirdPerson.getLastName());
        System.out.println(thirdPerson.getPassportId());

        Person forthPerson = new Person();
        Person fithPerson = new Person("Ivan", "Petrov");
        Person sixthPerson = new Person(666);
        Person seventhPerson = new Person("Nurlan", "Saburov", 93);

        System.out.println(forthPerson.getFirstName());
        System.out.println(forthPerson.getLastName());
        System.out.println(forthPerson.getPassportId());

        System.out.println(fithPerson.getFirstName());
        System.out.println(fithPerson.getLastName());
        System.out.println(fithPerson.getPassportId());

        System.out.println(sixthPerson.getFirstName());
        System.out.println(sixthPerson.getLastName());
        System.out.println(sixthPerson.getPassportId());

        System.out.println(seventhPerson.getFirstName());
        System.out.println(seventhPerson.getLastName());
        System.out.println(seventhPerson.getPassportId());
    }
}
