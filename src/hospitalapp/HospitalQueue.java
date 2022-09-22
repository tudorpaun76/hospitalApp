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

/*Value retreival*/

public class HospitalQueue {
    private int key;
    private Patient element;
    
    public HospitalQueue(int priority, Patient e){
        key = priority;
        element = e;
    }
    
    public int getKey(){
        return key;
    }
    
    public void setKey(int val){
        key = val;
    }
    
    public Patient getElement(){
        return element;
    }
    
    public void setElement(Patient e){
        element = e;
    }
    
    public String printPatient(){
        String msg;
        msg = " Name - "+element.getName()+ " "+" Age - "+element.getAge();
        return msg;
    }
}
