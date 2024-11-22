package hn.unah.poo.apartamentos.servicios;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.apartamentos.dtos.DueniosDTO;
import hn.unah.poo.apartamentos.modelos.Condominios;
import hn.unah.poo.apartamentos.modelos.Duenios;
import hn.unah.poo.apartamentos.repositorios.DueniosRepositorio;

@Service
public class DueniosServicio {

    @Autowired
    private DueniosRepositorio dueniosRepositorio;

    private static ModelMapper modelMapper;

    //Crear una unica instancia del modelMapper
    public ModelMapper getModelMapperSingleton(){

        if(modelMapper == null){
            modelMapper = new ModelMapper();
        }
        return modelMapper;
    }
    public List<DueniosDTO> obtenerTodos(){

        List<Duenios> listaDuenios = this.dueniosRepositorio.findAll();
        List<DueniosDTO> listaDueniosDTOS= new ArrayList<>();


        for(Duenios duenios : listaDuenios){

            DueniosDTO dueniosDTO = this.getModelMapperSingleton().map(duenios, DueniosDTO.class);

            List<Condominios> listaCondominios = duenios.getCondominios();
        }
    }

    public String crearDuenio(String dni , DueniosDTO nvoDuenio){
        if(this.dueniosRepositorio.existsById(dni)){
            return "Ya existe el duenio";
        }

        DueniosDTO nvoDuenioBD = this.getModelMapperSingleton().map(nvoDuenio, DueniosDTO.class);
        dueniosRepositorio.save(nvoDuenioBD);
    }


    public String obtenerPorDni(String dni){



    }
}
