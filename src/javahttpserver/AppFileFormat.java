/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahttpserver;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author informatica
 */
public class AppFileFormat {

    public AppFileFormat() throws JAXBException {
        JAXBContext jaxbContext     = JAXBContext.newInstance(Man.class);
        Marshaller jaxbMarshaller   = jaxbContext.createMarshaller();
        Man employeeObj = new Man("Pietro","Bonechi",18);
        
        jaxbMarshaller.marshal(employeeObj);
    }

 
}
