/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apex.soap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Duncan.Nyakundi
 */
public class JamboClient {
    public static void main(String[] args){
        
        try {
            URL url = new URL("http://localhost:9797/hw?wsdl");
            QName qname = new QName("http://soap.apex.com/","JamboServerImplService");
            Service service = Service.create(url,qname);
            JamboServer server = service.getPort(JamboServer.class);
            String name = "Duncan";
            System.out.println("::"+server.sayJambo(name));
        } catch (MalformedURLException ex) {
            Logger.getLogger(JamboClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
}
