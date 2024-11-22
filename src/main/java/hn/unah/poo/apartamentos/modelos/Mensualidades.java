package hn.unah.poo.apartamentos.modelos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="mensualidades")
public class Mensualidades {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensualidad;

    private double monto;

    private String estado;

    private LocalDate fechaPago;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "numeroCondominio", referencedColumnName = "numeroCondominio")
    @JsonIgnore
    private Condominios condominios;

   }
