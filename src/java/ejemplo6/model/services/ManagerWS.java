/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo6.model.services;

import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import proyecto.model.manager.Manager;

/**
 *
 * @author David
 */
@WebService(serviceName = "ManagerWS")
public class ManagerWS {

    @EJB
    private Manager ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "crearPaises")
    @Oneway
    public void crearPaises(@WebParam(name = "nombrepais") String nombrepais) {
        ejbRef.crearPaises(nombrepais);
    }
    
}
