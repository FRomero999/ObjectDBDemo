package com.mycompany.objectdbdemo;

import java.util.ArrayList;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import models.Alumno;
import models.Curso;

public class principal {

    public static EntityManagerFactory emf;
    
    public static void main(String[] args) {

        emf = Persistence.createEntityManagerFactory("bd.odb");
        
        Alumno a = new Alumno();
//        a.setNombre("Jorge");
        
//        var em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(a);
//        em.getTransaction().commit();
//        em.close();

//        var em = emf.createEntityManager();
//        em.getTransaction().begin();
//        a = em.find(Alumno.class, 1L);
//        a.setNombre("Francisco");
//        em.remove(a);
//        em.getTransaction().commit();
//        em.close();
//        System.out.println(a);
        
//        var em = emf.createEntityManager();
//        TypedQuery<Alumno> q = em.createQuery("select a from Alumno a where id=:numero", Alumno.class);
//        q.setParameter("numero",14);
//        var resultado = q.getResultList();
//        em.close();
//
//        System.out.println(resultado);
 
        Alumno al = new Alumno();
        al.setNombre("alumno");
        
        Curso c = new Curso();
        c.setNombre("AD");
        
        al.setCurso(c);
        c.getAlumnos().add(al);
        
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(al);
        em.getTransaction().commit();
        em.close();
        
        
        
        em = emf.createEntityManager();
        TypedQuery<Long> q = em.createQuery("select a.id from Alumno a order by a.id desc", Long.class);
        var resultado = q.getResultList().get(0);
        em.close();

        System.out.println(resultado);        
    }
    
}
