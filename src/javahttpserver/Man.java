/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahttpserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author informatica
 */
@XmlRootElement
public class Man {
    @XmlElement
    private String nome = "Pietro";
    @XmlElement
    private String cognome ="Bonechi";
    @XmlElement
    private int eta =18; 
}
