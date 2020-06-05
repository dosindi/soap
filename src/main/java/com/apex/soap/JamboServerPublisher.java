/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apex.soap;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Duncan.Nyakundi
 */
public class JamboServerPublisher {
    public static void main(String[] args) {
        System.out.println("Beginning");
        Endpoint.publish("http://localhost:9797/hw", new JamboServerImpl());
        System.out.println("Done publishing.");
    }
}
