package model;

import java.util.Scanner;

/**
 *
 * @author Amauri
 */
public class Professor {

    private String name;
    private char gender;
    private int age;
    private String cpf;

    public Professor() {
        this.name = "";
        this.gender = ' ';
        this.age = 0;
        this.cpf = "000.000.000-00";
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
     * @return the cpf
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        System.out.print("Informe o CPF: ");
        this.cpf = leitor.next();
    }
    
    public void Print(){
        System.out.println("----------- DADOS PROFESSOR -----------");
        System.out.println("Nome: " + this.name);
        System.out.println("Genero: " + this.gender);
        System.out.println("Idade: " + this.age);
        System.out.println("CPF: " + this.cpf);
        System.out.println("---------------------------------------");
    }
    
    public void Copy(Professor other){
        this.name = other.getName();
        this.gender = other.getGender();
        this.age = other.getAge();
        this.cpf = other.getCpf();
    }

}
