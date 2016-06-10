/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import static javax.persistence.Persistence.createEntityManagerFactory;

/**
 *
 * @author Developer
 */
public class PruebaGuardado {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        javax.persistence.EntityManager entityManager = createEntityManagerFactory(cadena_conexion).createEntityManager();;
        Ruta r = new Ruta();
        r.setNombre("Faruck");
        r.setTipo("circular");
        entityManager.getTransaction().begin();
        entityManager.persist(r);
        entityManager.getTransaction().commit();
    }

    public static final String cadena_conexion = "testingPU";
}
