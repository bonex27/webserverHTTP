/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  javahttpserver;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author informatica
 */
@XmlRootElement
public class App {
    private  int porta;
    private boolean redirect;

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public boolean getRedirect() {
        return redirect;
    }

    public void setRedirect(boolean redirect) {
        this.redirect = redirect;
    }
    
    
  

    
    
}
