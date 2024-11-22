package hn.unah.poo.apartamentos.dtos;


import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DueniosDTO {

    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;

    private List<CondominiosDTO> condominiosDTO;

}
