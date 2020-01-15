/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahttpserver;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author informatica
 */
public class AppFileFormat {

    Man m = new Man();
    public AppFileFormat() {
    }
    public void jaxbObjectToXML() throws JAXBException
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(Man.class);
             
            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            //Formatting file
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
           //Store XML to File
            File file = new File("Xml.xml");
             
            //Writes XML file to file-system
            jaxbMarshaller.marshal(m, file);
    }

 
}
