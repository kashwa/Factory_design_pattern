/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mobile;

/**
 *
 * @author aabedxx
 */
public class OSfactory {
    
    public OS getInstance(String str){
        
        if (str.equals("Open")||str.equals("Powerful"))
            return new Android();
        
        else if (str.equals("Secure")||str.equals("Beauty"))
            return new iOS();
        
        else 
            return new windows();
    }
    
}
