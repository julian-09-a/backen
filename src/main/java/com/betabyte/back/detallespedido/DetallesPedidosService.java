package com.betabyte.back.detallespedido;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallesPedidosService {
    @Autowired
    DetallesPedidosRepository detallesPedidosRepository;
    private DetallesPedidosService detallesPedidoRepository;

    ArrayList<DetallesPedidosModel> findAll(){
        return (ArrayList<DetallesPedidosModel>) detallesPedidosRepository.findAll();
    }

    DetallesPedidosModel save(DetallesPedidosModel detallesPedidosModel){
        return detallesPedidosRepository.save(detallesPedidosModel);
    }

    DetallesPedidosModel findById(Long id){
        return detallesPedidosRepository.findById(id).get();
    }

    void deleteById(Long id){
        detallesPedidosRepository.deleteById(id);
    }

    DetallesPedidosModel update(Long id ,DetallesPedidosModel detallesPedidosModel){
        DetallesPedidosModel detallesPedidosForUpdate = detallesPedidosRepository.findById(id).get();
        
        if (detallesPedidosModel.getAddress() != 0){
            detallesPedidosForUpdate.setAddress(detallesPedidosModel.getAddress());
        }

        if (detallesPedidosModel.getSend()!= null){
            detallesPedidosForUpdate.setSend(detallesPedidosModel.getSend());
        }

        return detallesPedidosRepository.save(detallesPedidosForUpdate); 
    }

    public DetallesPedidosModel delate(Long id){
        DetallesPedidosModel detallesPedidosModel = detallesPedidosRepository.findById(id).orElse(null);
        if (detallesPedidosModel != null){
            detallesPedidosRepository.deleteById(id);
        }
        
        detallesPedidoRepository.deleteById(id);
        return detallesPedidosModel;
    }



    

    


}
