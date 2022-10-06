package model;

import java.util.Scanner;
import lombok.Data;

/**
 *
 * @author Amauri
 */
@Data
public class Aluno {

    private int id;
    private String name;
    private char gender;
    private int age;
    private String collegeID;
    private int yearOfEntry;

   /* public Aluno() {
        this.name = "";
        this.gender = ' ';
        this.age = 0;
        this.collegeID = "0000000000";
        this.yearOfEntry = "0000";
    }*/

    public void Fill(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("----------- PREENCHER ALUNO -----------");
        System.out.print("Informe o Nome: ");
        this.name = leitor.nextLine();
        System.out.print("Informe o Genero (M OU F): ");
        this.gender = leitor.nextLine().charAt(0);
        System.out.print("Informe a Idade: ");
        this.age = leitor.nextInt();
        System.out.print("Informe a Matricula: ");
        this.collegeID = leitor.nextLine();
        System.out.print("Informe o ano de Ingresso: ");
        this.yearOfEntry = leitor.nextInt();
    }
    
    public void Print(){
        System.out.println("----------- DADOS ALUNO -----------");
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
