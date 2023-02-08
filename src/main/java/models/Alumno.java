/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Alumno implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    
    private String nombre;
    
    @ManyToOne( cascade = CascadeType.ALL)
    private Curso curso;
}
