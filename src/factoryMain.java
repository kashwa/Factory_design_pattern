
import com.mobile.Android;
import com.mobile.OS;
import com.mobile.OSfactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aabedxx
 */
public class factoryMain {
    
    //  here is our client.
    
    public static void main(String[]args){
        
        /**
         * but here down below comes the problem,
         * in that way the client can know all the phones that implements
         * the OS interface, so the factory pattern is used to hide the details.
         * 
         * OS mob = new Android();
         *  mob.spec();
         */
        
        OSfactory osf = new OSfactory();
        
        OS obj = osf.getInstance("Beauty");
        obj.spec();
        
        
    }
}
