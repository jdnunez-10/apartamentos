package hn.unah.poo.apartamentos.servicios;

import java.time.LocalDate;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.apartamentos.dtos.CondominiosDTO;
import hn.unah.poo.apartamentos.repositorios.CondominiosRepositorio;

@Service
public class CondominiosServicio {

    @Autowired
    private CondominiosRepositorio condominiosRepositorio;

    private static ModelMapper modelMapper;

     //Crear una unica instancia del modelMapper
    public ModelMapper getModelMapperSingleton(){

        if(modelMapper == null){
            modelMapper = new ModelMapper();
        }
        return modelMapper;
    }

    LocalDate fechaHoy = LocalDate.now();

    public String crearCondominio(CondominiosDTO nvoCondominio){

        

    }
    
    
}
