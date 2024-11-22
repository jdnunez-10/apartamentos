package hn.unah.poo.apartamentos.dtos;

import java.time.LocalDate;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MensualidadesDTO {

    private int idMensualidad;

    private double monto;

    private String estado;

    private LocalDate fechaPago;
    
}
