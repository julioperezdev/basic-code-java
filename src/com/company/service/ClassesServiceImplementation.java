package com.company.service;

import com.company.model.Student;

import java.util.Comparator;
import java.util.List;

public class ClassesServiceImplementation {

    public void printNamesAllStudentsUsingUsualFor(List<Student> students){
        System.out.println("initialize printNamesAllStudentsUsingUsualFor");
        for(Student student: students){
            System.out.println(student.getNameStudent());
        }
    }

    public void printAgeAllStudentsUsingUsualFor(List<Student> students){
        System.out.println("initialize printAgeAllStudentsUsingUsualFor");
        for(Student student: students){
            System.out.println(student.getAgeStudent());
        }
    }

    public void printNamesAllStudentsUsingForEach(List<Student> students){
        System.out.println("initialize printNamesAllStudentsUsingForEach");
        students.forEach(student -> System.out.println(student.getNameStudent()));
    }

    public void printAgeAllStudentsUsingForEach(List<Student> students){
        System.out.println("initialize printAgeAllStudentsUsingForEach");
        students.forEach(student -> System.out.println(student.getAgeStudent()));
    }

    public void addAgeForEachToAllStudentsUsingStreams(List<Student> students){
        System.out.println("initialize addAgeForEachToAllStudentsUsingStreams");
        students.stream()
                .mapToInt(student -> student.getAgeStudent())
                .map(number -> number + 1)
                .forEach(System.out::println);
    }

    public void addAgeForEachToAllStudentsUsingStreamsAndReferencePrivateMethod(List<Student> students){
        System.out.println("initialize addAgeForEachToAllStudentsUsingStreamsAndReferencePrivateMethod");
        students.stream()
                .mapToInt(student -> student.getAgeStudent())
                .map(this::addOneNumber)
                .forEach(System.out::println);
    }

    public void filterAllStudentsUsingStreams(List<Student> students){
        System.out.println("initialize filterAllStudentsUsingStreams");
        students.stream()
                .mapToInt(Student::getAgeStudent)
                .filter(limitAge -> limitAge > 16)
                .forEach(System.out::println);
    }

    public void filterTheMostOldStudentsUsingStreams(List<Student> students){
        System.out.println("initialize filterAllStudentsUsingStreams");
        students.stream()
                .max(Comparator.comparing(Student::getAgeStudent))
                .ifPresent(person -> {
                    System.out.println(person.getNameStudent());
                });
    }


    private int addOneNumber(int number){
        return number +1;
    }


}
