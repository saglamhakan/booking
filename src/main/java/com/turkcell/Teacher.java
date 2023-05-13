package com.turkcell;

public class Teacher {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void teslimAlindi(Student student, Book book){
        System.out.println(student.getName() + " isimli ve " + student.getStudentNumber() + " numaralı öğrenciden " + book.getName()+ " isimli kitap teslim alinmiştir.");
    }
    public void teslimEdildi(Student student, Book book){
        System.out.println(student.getName() + " isimli ve " + student.getStudentNumber() + " numaralı öğrenciye " + book.getName()+ " isimli kitap teslim edilmiştir.");
    }
}
