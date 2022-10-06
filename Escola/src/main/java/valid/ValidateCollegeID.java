/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid;

import java.util.Calendar;


public class ValidateCollegeID {
    /**
    * Aceita 0000-00, 7 dígitos ou 000000, 6 dígitos
    * @param collegeID
    * @return
    */
    public boolean validateID(String collegeID){
        if (collegeID.length() != 7 && collegeID.length() != 6) {
            return false;
        }
        
        //Retira os caracteres deixando apenas digitos
        if(collegeID.length() == 7){
            collegeID = collegeID.replaceAll("-", "");
        }
        
        /*se tem tamanho 11 e so possui digitos
        if(collegeID.length() == 6 && collegeID.matches("[0-9]*")){
            String[] vet = collegeID.split("");
        }*/
        
        // Se o ano é menor que 1980 e maior que o atual, retorna falso
        String yearVerify = collegeID.substring(0, 4);
        int yearCollegeID = Integer.parseInt(yearVerify);
        
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        
        if ( yearCollegeID < 1980 && yearCollegeID > year){
            return false;
        }
        
        return true;
    }
    
}
