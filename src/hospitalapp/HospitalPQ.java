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
public interface HospitalPQ {
    public void enqueue(int key, Object element);
    public int size ();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQueue();
}
