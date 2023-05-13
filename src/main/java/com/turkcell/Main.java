package com.turkcell;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kitap Teslimat etmek için - T, Kitap teslim Almak için - A yazınız.");
        Scanner input = new Scanner(System.in);
        String inputValue = input.next();

        if(Objects.equals(inputValue, "T") || Objects.equals(inputValue, "t")){
            teslimAlmaFonksiyonu();
        } else if (Objects.equals(inputValue, "A") || Objects.equals(inputValue, "a")) {
            teslimVermeFonksiyonu();
        } else {
            System.out.print("Geçersiz değer girdiniz.");
        }
    }

    static public void teslimAlmaFonksiyonu(){
        Student student = new Student();
        Book book = new Book();
        Teacher teacher = new Teacher();
        System.out.print("Teslim Alan Öğrenci İsmi: ");
        Scanner inputName = new Scanner(System.in);
        student.setName(inputName.nextLine());

        System.out.print("Teslim Alan Öğrenci Numarası: ");
        Scanner inputStudentNumber = new Scanner(System.in);
        student.setStudentNumber(inputStudentNumber.nextInt());

        System.out.print("Teslim Eden Öğretmen Numarası: ");
        Scanner inputTeacherName = new Scanner(System.in);
        teacher.setName(inputTeacherName.next());

        System.out.print("Teslim Edilen Kitap Adı: ");
        Scanner bookName = new Scanner(System.in);
        book.setName(bookName.next());

        System.out.print("Teslim Edilen Kitap ISBN: ");
        Scanner bookISBN = new Scanner(System.in);
        book.setName(bookISBN.next());

        String value = student.getName() + " isimli ve " + student.getStudentNumber() + " numaralı öğrenciden " + book.getName() + " isimli kitap " + teacher.getName() + " tarafından teslim alinmiştir.";
        System.out.print(value);
    }

    static public void teslimVermeFonksiyonu(){
        Student student = new Student();
        Book book = new Book();
        Teacher teacher = new Teacher();
        System.out.print("Teslim Eden Öğrenci İsmi: ");
        Scanner inputName = new Scanner(System.in);
        student.setName(inputName.nextLine());

        System.out.print("Teslim Eden Öğrenci Numarası: ");
        Scanner inputStudentNumber = new Scanner(System.in);
        student.setStudentNumber(inputStudentNumber.nextInt());

        System.out.print("Teslim Alan Öğretmen Numarası: ");
        Scanner inputTeacherName = new Scanner(System.in);
        teacher.setName(inputTeacherName.next());

        System.out.print("Teslim Edilen Kitap Adı: ");
        Scanner bookName = new Scanner(System.in);
        book.setName(bookName.next());

        System.out.print("Teslim Edilen Kitap ISBN: ");
        Scanner bookISBN = new Scanner(System.in);
        book.setName(bookISBN.next());

        String value = student.getName() + " isimli ve " + student.getStudentNumber() + " numaralı öğrencisine " + book.getName()+ " isimli kitap " + teacher.getName() +" tarafından teslim edilmiştir.";
        System.out.print(value);
    }
    }
