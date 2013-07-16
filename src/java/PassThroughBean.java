/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hiro
 */
@ManagedBean
@SessionScoped
public class PassThroughBean {

    private String message;
    
        public String getMessage() {       
        return message;
    }    
    public void setMessage(String message) {       
        this.message = message;
    } 
    
    public String send(){
        return "sendsuccess.xhtml";
    }
}
