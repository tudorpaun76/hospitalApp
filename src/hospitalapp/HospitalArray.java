/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalapp;
import java.util.*;

/**
 *
 * @author tudor
 */


/*Priority Queue*/
public class HospitalArray implements HospitalPQ 
{
   private ArrayList<HospitalQueue> PQueue;
   
   public HospitalArray(){
       PQueue = new ArrayList<HospitalQueue>();
   }
   
   public boolean isEmpty(){
       return PQueue.isEmpty();
   }
   
   public int size(){
       return PQueue.size();
   }
   
   private int positionInsert (int newkey)
        {
            boolean found;
            HospitalQueue hosp;
            int position;
            found = false;
            position = 0;
            while (position<PQueue.size() && !found){
            hosp = PQueue.get(position);
            if(hosp.getKey()>newkey)
                position = position +1;
            else{
                found = true;
            }
            }
            return position;
        }
   
   public void enqueue (int priorkey, Object item)
   {
       int index;
       HospitalQueue hosp = new HospitalQueue(priorkey, (Patient)item);
       
       index = positionInsert(priorkey);
       
       if (index == size())
           PQueue.add(hosp);
       else
           PQueue.add(index, hosp);
   }
   
   public Object dequeue(){
       return PQueue.remove(0);
   }
   
   public String printPQueue(){
       String printStr = new String ();
       HospitalQueue hosp;
       for (int i = 0; i<PQueue.size();i++){
           hosp = PQueue.get(i);
           printStr = printStr.concat (hosp.printPatient()+" "+ " Priority level:"+hosp.getKey()+"\n");
       }
       return printStr;
   
   }
}
