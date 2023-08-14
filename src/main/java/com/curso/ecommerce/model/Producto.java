
package com.curso.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;


/**
 *
 * @author edgar
 */
@Data

@Entity
@Table(name = "productos")

public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private double precio;
    private int cantidad;
    
    @ToString.Exclude
    @ManyToOne
    private  Usuario usuario;

   
    
    
    
     public Producto() {
         
    }
    
    public Producto(Integer id, String nombre, String descripcion, String imagen, double precio, int cantidad, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
        this.usuario = usuario;
        
        
    }

   

   
    
    
}
