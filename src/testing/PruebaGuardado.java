/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.ArrayList;
import java.util.Date;
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
        
        
        Vehiculo v = new Vehiculo();
        v.setPlaca("XRC-678");
        r.setPlaca(v);
        
     
      
        ActividadPrincipal ac = new ActividadPrincipal();
        ac.setIdActividadPrincipal(Long.parseLong("123123"));
        r.setIdActividadPrincipal(ac);
        
        UsuarioProyecto up = new UsuarioProyecto();
        up.setIdUsuarioProyecto(Long.parseLong("1098759825"));
        r.setIdUsuarioProyecto(up);
        
        Proyecto pro = new Proyecto();
        pro.setIdProyecto(Long.parseLong("120936"));
        r.setIdProyecto(pro);
        
       
        
        
        List<RutaExterna> lista = new ArrayList<RutaExterna>();
        RutaExterna ru = new RutaExterna();
        ru.setIngreso("00");
        ru.setHoraLlegada(null);
        lista.add(ru);
        r.setRutaExternaCollection(lista);
        
        
        Ruta aaa = new Ruta();
        aaa.setNombre("Faruck");
        aaa.setTipo("circular");
        
        r.setFecha(null);
        r.setHoraFin(null);
        r.setHoraInicio(null);
        r.setKmFinal(Integer.parseInt("122"));
        r.setKmInicial(Integer.parseInt("1280"));
        
        
        
//        entityManager.getTransaction().begin();
//        entityManager.persist(r);
//        entityManager.getTransaction().commit();
    }

    public static final String cadena_conexion = "testingPU";
}
