/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apex.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author Duncan.Nyakundi
 */
@WebService
@SOAPBinding(style=Style.RPC)
public interface JamboServer {
    /**
     * Web service operation
     */
    @WebMethod//(operationName = "sayJambo")
    String sayJambo( String parameter);
    
}
