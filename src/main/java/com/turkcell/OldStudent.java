package com.turkcell;

public class OldStudent {
    String name;
    String surname;
    private int number;
    int birthYear;

    public  void joinClass(String className){
        System.out.println(name + " is join to " + className);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public OldStudent(){
        System.out.println("Bir öğrenci oluşturuldu");
    }
}
