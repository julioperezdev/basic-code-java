package com.company.service;

public class StudentServiceImplementation {

    /**
     * try to learn if/else condition
     * and add < , > , ==, !=, ||, && to do more complex code
     */

    /**
     * Exercise One, we check if student have less age to study
     * @param name
     * @param age
     * @return A String with name student and concat a human response;
     */
    public String checkIfStudentHaveLessOfConditionAndResponseString(String name, int age){
        if(age < 18){
            return name + " cant use the service";
        }
        return name + " can pass this code";
    }

    /**
     * Exercise Two, we check if student have less age to study
     * @param age
     * @return
     */
    public boolean checkIfStudentHaveLessOfConditionAndResponseBoolean(int age){
        if(age < 18){
            return false;
        }
        return true;
    }

    /**
     * Exercise Three, we check if student have online classes
     * @param typeClassOfStudent
     * @return
     */
    public boolean checkIfStudentHaveOnlineClasses(String typeClassOfStudent){
        if(typeClassOfStudent != "online"){
            return false;
        }
        return true;
    }

    /**
     * Exercise Four, we check if student have perfect score and had online classes
     * @param scoreStudent
     * @param typeClassOfStudent
     * @return
     */
    public boolean checkIfStudentHavePerfectScoreAndHadOnlineClasses(int scoreStudent, String typeClassOfStudent){
        if(typeClassOfStudent != "online"){
            return false;
        }
        if(scoreStudent < 20){
            return false;
        }
        return true;
    }

    /**
     * Exercise Four, we check if student have perfect score and had online classes
     * This is the 2.0 version
     * @param scoreStudent
     * @param typeClassOfStudent
     * @return
     */
    public boolean checkIfStudentHavePerfectScoreAndHadOnlineClassesSecondVersion(int scoreStudent, String typeClassOfStudent){
        if(typeClassOfStudent != "online" && scoreStudent < 20){
            return false;
        }
        return true;
    }

    /**
     * Exercise Five, we check if student had bad behavior or bad score
     * @param behavior
     * @param scoreStudent
     * @return
     */
    public boolean checkIfStudentHadBadBehaviorOrBadScore(boolean behavior, int scoreStudent){
        return behavior && scoreStudent >= 10;
    }
}
