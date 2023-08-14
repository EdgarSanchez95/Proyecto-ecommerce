
package com.curso.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;


/**
 *
 * @author edgar
 */
@Data
@Entity
@Table(name = "detalles")
public class DetalleOrden {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;
    
    @ToString.Exclude
    @OneToOne
    private Orden orden;
    
    @ToString.Exclude
    @ManyToOne
    private Producto producto;

    

    public DetalleOrden(Integer id, String nombre, double cantidad, double precio, double total, Orden orden, Producto producto) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
        this.orden = orden;
        this.producto = producto;
    }

    public DetalleOrden() {
    }

       
    
}
