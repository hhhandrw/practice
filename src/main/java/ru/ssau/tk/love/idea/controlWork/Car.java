package ru.ssau.tk.love.idea.controlWork;

public class Car {
    private String number;
    private String model;
    private String name;
    public static int counter = 0;

    public Car(String number, String model, String name) {
        this.number = number;
        this.model = model;
        this.name = name;
        counter += 1;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
