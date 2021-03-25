package com.javarush.task.pro.test;

public class Artifact {
    private static int artefactsCount = 0;
    int count = artefactsCount;
    String culture;
    int century;
    String name;

    public Artifact(){
       this.artefactsCount++;
        this.name = "    Артфакт без культуры ";
    }
    public Artifact(String culture){
        this.culture = culture;
        this.artefactsCount++;
    }
    public Artifact(String culture, int century){
        this.culture = culture;
        this.century = century;
        this.artefactsCount++;

    }


    public static void main(String[] args) {
        Artifact pictures = new Artifact();
        Artifact pictures1 = new Artifact("Russia");
        Artifact pictures2 = new Artifact("Armenia",21);
        System.out.println("Номер Культура Век");
        System.out.println(" "+pictures.count+pictures.name);
        System.out.println(" "+pictures1.count+"    "+pictures1.culture);
        System.out.println(" "+pictures2.count+"    "+pictures2.culture+"  "+pictures2.century);
    }
}



