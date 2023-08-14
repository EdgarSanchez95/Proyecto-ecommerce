
package com.curso.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;
import lombok.ToString;


/**
 *
 * @author edgar
 */
@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String username;

    
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;
    private String password;
    
    @ToString.Exclude
    @OneToMany(mappedBy = "usuario")
    private List<Producto> productos;
    
    @ToString.Exclude
    @OneToMany(mappedBy = "usuario")
    private List<Orden> ordenes;

       
    
    public Usuario(){
    
    }

    public Usuario(int id, String nombre, String username, String email, String direccion, String telefono, String tipo, String password) {
        
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
        this.password = password;
        
        this.productos = productos;
        this.ordenes = ordenes;
    }

    

   
    
        
   
}

