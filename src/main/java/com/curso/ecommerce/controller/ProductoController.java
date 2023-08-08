
package com.curso.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author edgar
 */
@Controller
@RequestMapping("/productos")
public class ProductoController {
    
    @GetMapping("")
    public String show(){
    
        return "productos/show";
    }
}
