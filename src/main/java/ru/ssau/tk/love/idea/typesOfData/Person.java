package ru.ssau.tk.love.idea.typesOfData;

public class Person {
    public String firstName;
    public String lastName;
    public int passportId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }


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
    }
}
