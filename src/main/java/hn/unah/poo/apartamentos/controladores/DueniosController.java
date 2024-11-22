package hn.unah.poo.apartamentos.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.apartamentos.dtos.DueniosDTO;
import hn.unah.poo.apartamentos.servicios.DueniosServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api/duenios")
public class DueniosController {

    @Autowired
    private DueniosServicio dueniosServicio;
    
    @GetMapping("/obtener/todos")
    public List<DueniosDTO> obtenerTodos(){
        
        return this.dueniosServicio();
    }

    @PostMapping("/crear/duenio")
    public String crearDuenio(@RequestBody DueniosDTO entity) {
        
        return this.dueniosServicio(entity);
    }

    @GetMapping("/obtener/{dni}")
    public String obtenerPorDni(@PathVariable(name = "dni") String dni) {
        return this.dueniosServicio(dni);
    
    }
    
    
}
   
