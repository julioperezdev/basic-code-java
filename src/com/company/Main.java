package com.company;

import com.company.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //main data type

        //numeric
        final int intNumber = 123;
        final long longNumber = 123L;
        final Integer integerReferenceNumber = 123;
        final Long longReferenceNumber = 123L;

        //string
        final String StringReference = "abc";
        final Character charType;
        final char charValue;

        //boolean
        final boolean booleanTrue = true;
        final boolean booleanFalse = false;
        final Boolean booleanReferenceTrue;
        final Boolean booleanReferenceFalse;

        //Arrays
        final int[] intArrayNumber = {1,2,3,4,100,32,453,2};
        final String[] StringArrayReference = {"Julio", "Andres", "Maria", "Andres"};
        final boolean[] booleanArray = {true, false, true, true};

        //Object
        final Student studentObject = new Student("Julio", 25);

        //Object Arrays
        final Student[] studentArrayObject = {new Student("Julio", 25),new Student("Maria", 60)};
        final List<Student> studentList = new ArrayList<>();

        //others
        final byte byteValue;
        final byte[] byteArrayValue;
    }
}
