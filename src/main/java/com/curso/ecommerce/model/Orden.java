
package com.curso.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;
import lombok.ToString;


/**
 *
 * @author edgar
 */
@Data
@Entity
@Table(name = "ordenes")
public class Orden {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double total;        
    
    @ToString.Exclude
    @ManyToOne
    private Usuario usuario;
    
    @ToString.Exclude
    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;


    
    public Orden(){
    
    }

    public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double total, Usuario usuario, DetalleOrden detalle) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
        this.usuario = usuario;
        this.detalle = detalle;
    }

        
    
}
