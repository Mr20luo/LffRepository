package model;

public class Stuinfo {

    private int id;
    private String name;
    private char sex;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Stuinfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}

