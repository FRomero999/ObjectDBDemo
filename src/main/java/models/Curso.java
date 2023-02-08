/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author frome
 */
@Data
@Entity
public class Curso implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    
    private String nombre;
    
    @OneToMany( mappedBy="curso" )
    private List<Alumno> alumnos = new ArrayList<>(0);
}
