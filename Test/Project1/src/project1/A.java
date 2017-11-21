/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Student
 */
public class A {
    
    public Boolean first(int a){
        if(a > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void second(int b){
        if(b == 0)
        {
            b += 3;
        }
        else if(b > 0)
        {
            b += 8;
        }
        else
        {
            b += 124;
        }
    }
    
    public Boolean third(){
        int c = 0;
        
        if(c < 0)
            return true;
        else
            return false;
    }
}
