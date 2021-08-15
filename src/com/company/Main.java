package com.company;

import com.company.model.Student;
import com.company.service.StudentServiceImplementation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentServiceImplementation studentServiceImplementation = new StudentServiceImplementation();
        
        String exerciseNumberOne = studentServiceImplementation.checkIfStudentHaveLessOfConditionAndResponseString("Julio", 25);
        System.out.println(exerciseNumberOne);

        boolean exerciseNumberTwo = studentServiceImplementation.checkIfStudentHaveLessOfConditionAndResponseBoolean(25);
        System.out.println(exerciseNumberTwo);

        boolean exerciseNumberThree = studentServiceImplementation.checkIfStudentHaveOnlineClasses("online");
        System.out.println(exerciseNumberThree);

        boolean exerciseNumberFour = studentServiceImplementation.checkIfStudentHavePerfectScoreAndHadOnlineClasses(15, "online");
        System.out.println(exerciseNumberFour);

        boolean exerciseNumberFourSecondVersion = studentServiceImplementation.checkIfStudentHavePerfectScoreAndHadOnlineClassesSecondVersion(16, "faceToFace");
        System.out.println(exerciseNumberFourSecondVersion);

        boolean exerciseNumberFive = studentServiceImplementation.checkIfStudentHadBadBehaviorOrBadScore(true, 12);
        System.out.println(exerciseNumberFive);


    }

    /**
     * In "variable" branch every types in this private method was in main method
     * to be more clear i moved here.
     */
    private void branchVariablesMain(){
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
