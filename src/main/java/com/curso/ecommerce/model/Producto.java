
package com.curso.ecommerce.model;

import lombok.Data;

/**
 *
 * @author edgar
 */
@Data
public class Producto {
    
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private double precio;
    private int cantidad;
    
}
