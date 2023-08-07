
package com.curso.ecommerce.service;

import org.springframework.stereotype.Service;
import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.repository.ProductoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author edgar
 */
@Service
public class ProductoServiceImple implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public void update(Producto producto) {
       productoRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {
       productoRepository.deleteById(id);
    }
    
}
