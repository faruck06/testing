/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.ArrayList;
import java.util.List;
import static javax.persistence.Persistence.createEntityManagerFactory;

/**
 *
 * @author Developer
 */
public class PruebaGuardado {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //javax.persistence.EntityManager entityManager = createEntityManagerFactory(cadena_conexion).createEntityManager();;
        
        ReporteDiario r = new ReporteDiario();
        Empleado e = new Empleado();
        e.setCedula("1s23");
        r.setIdEmpleado(e);
        List<RutaExterna> lista = new ArrayList<RutaExterna>();
        RutaExterna ru = new RutaExterna();
        ru.setIngreso("00");
        lista.add(ru);
        r.setRutaExternaCollection(lista);
        
        
        Ruta aaa = new Ruta();
        aaa.setNombre("Faruck");
        aaa.setTipo("circular");
//        entityManager.getTransaction().begin();
//        entityManager.persist(r);
//        entityManager.getTransaction().commit();
    }

    public static final String cadena_conexion = "testingPU";
}
