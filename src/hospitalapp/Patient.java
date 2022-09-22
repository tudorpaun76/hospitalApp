/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalapp;

/**
 *
 * @author tudor
 */

/*Creating the patient*/

public class Patient {
    private String name;
    private String age;
    
    public Patient(){
        name = new String();
        age = new String ();
    
}

public void setName(String n){
    name = n;
}

public void setAge(String a){
    age = a;
}


public String getName(){
    return name;
}

public String getAge(){
    return age;
}


    
}
