/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.model.manager;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ejemplo6.model.entities.Paises;

/**
 *
 * @author David
 */
@Stateless
public class Manager {

  @PersistenceContext(unitName = "pruebaDS")
    private EntityManager em;

    public void crearPaises(String nombrepais) {
        Paises pais = new Paises();
        pais.setNombrePais(nombrepais);
        em.persist(pais);
    }
}
