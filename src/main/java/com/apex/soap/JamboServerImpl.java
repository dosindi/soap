/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apex.soap;

import javax.jws.WebService;

/**
 *
 * @author Duncan.Nyakundi
 */
@WebService(endpointInterface="com.apex.soap.JamboServer")
public class JamboServerImpl implements JamboServer{

    @Override
    public String sayJambo(String parameter) {
        
          return "Jambo "+parameter+"! Have a good day";
   
    }
    
}
