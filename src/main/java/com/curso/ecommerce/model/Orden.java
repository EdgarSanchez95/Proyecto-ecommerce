
package com.curso.ecommerce.model;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author edgar
 */
@Data
public class Orden {
    
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double total;        
    
}
