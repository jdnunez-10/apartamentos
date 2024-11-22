package hn.unah.poo.apartamentos.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CondominiosDTO {
    
    private int numeroCondominio;

    private int nivel;

    private double area;

    private String color;

    private int parqueos;
 
    private MensualidadesDTO mensualidadesDTO;
}
