package hn.unah.poo.apartamentos.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.apartamentos.dtos.CondominiosDTO;
import hn.unah.poo.apartamentos.servicios.CondominiosServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/condominios")
public class CondominiosController {

@Autowired
private CondominiosServicio condominiosServicio;


@PostMapping("/crear/condominio")
public String postMethodName(@RequestBody CondominiosDTO entity) {
    
    return this.condominiosServicio.crearCondominio(entity);

}
    }

