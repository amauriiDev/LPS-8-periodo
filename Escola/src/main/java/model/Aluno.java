package model;

import java.util.Scanner;

/**
 *
 * @author Amauri
 */
public class Aluno {

    private String name;
    private char gender;
    private int age;
    private String collegeID;
    private String yearOfEntry;

    public Aluno() {
        this.name = "";
        this.gender = ' ';
        this.age = 0;
        this.collegeID = "0000000000";
        this.yearOfEntry = "0000";
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return this.gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * @return the collegeID
     */
    public String getCollegeID() {
        return this.collegeID;
    }

    /**
     * @param collegeID the collegeID to set
     */
    public void setCollegeID(String collegeID) {
        this.collegeID = collegeID;
    }

    /**
     * @return the yarOfEntry
     */
    public String getYearOfEntry() {
        return this.yearOfEntry;
    }

    /**
     * @param yarOfEntry the yarOfEntry to set
     */
    public void setYearOfEntry(String yarOfEntry) {
        this.yearOfEntry = yarOfEntry;
    }

    public void Fill(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("----------- PREENCHER PROFESSOR -----------");
        System.out.print("Informe o Nome: ");
        this.name = leitor.nextLine();
        System.out.print("Informe o Genero (M OU F): ");
        this.gender = leitor.nextLine().charAt(0);
        System.out.print("Informe a Idade: ");
        this.age = leitor.nextInt();
        System.out.print("Informe a Matricula: ");
        this.collegeID = leitor.nextLine();
        System.out.print("Informe o ano de Ingresso: ");
        this.yearOfEntry = leitor.nextLine();
    }
    
    public void Print(){
        System.out.println("----------- DADOS PROFESSOR -----------");
        System.out.println("Nome: " + this.name);
        System.out.println("Genero: " + this.gender);
        System.out.println("Idade: " + this.age);
        System.out.println("Matricula: " + this.collegeID);
        System.out.println("Ano de Ingresso: " + this.yearOfEntry);
        System.out.println("---------------------------------------");
    }
    
    public void Copy(Aluno other){
        this.name = other.getName();
        this.gender = other.getGender();
        this.age = other.getAge();
        this.collegeID = other.getCollegeID();
        this.yearOfEntry = other.getYearOfEntry();
    }
}
