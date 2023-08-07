
package com.curso.ecommerce.service;

import com.curso.ecommerce.model.Producto;
import java.util.Optional;

/**
 *
 * @author edgar
 */
public interface ProductoService {
    
    public Producto save(Producto producto);
    public Optional<Producto> get(Integer id);
    public void update (Producto producto);
    public void delete(Integer id);
}
