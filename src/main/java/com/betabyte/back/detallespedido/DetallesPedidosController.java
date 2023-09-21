package com.betabyte.back.detallespedido;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("Detalles del pedido")
public class DetallesPedidosController {
    @Autowired
    DetallesPedidosService detallesPedidosService;

    @GetMapping
    ArrayList<DetallesPedidosModel> findAll(){
        return detallesPedidosService.findAll();
    }

    @PostMapping
    public DetallesPedidosModel save(@RequestBody DetallesPedidosModel detallesPedidosModel) {
        return detallesPedidosService.save(detallesPedidosModel);
    }

    @GetMapping("/{id}")
    public DetallesPedidosModel findById(@RequestParam long id){
        return detallesPedidosService.findById(id);
    }

    @PatchMapping ("/{id}")
    public DetallesPedidosModel update(@RequestParam Long id, @RequestBody DetallesPedidosModel DetallesPedidosModel){
        return detallesPedidosService.update(id, DetallesPedidosModel);
    }

    @DeleteMapping ("/{id}")
    public DetallesPedidosModel delete(@RequestParam Long id){
        return detallesPedidosService.delate(id);
    }
    
}
