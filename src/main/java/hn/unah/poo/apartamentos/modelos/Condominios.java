package hn.unah.poo.apartamentos.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "condominios")

public class Condominios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroCondominio;

    private int nivel;

    private double area;

    private String color;

    private int parqueos;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="dni", referencedColumnName = "dni")
    @JsonIgnore
    private Duenios duenios;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "numeroCondominio", referencedColumnName = "numeroCondominio")
    private Mensualidades mensualidades;
}
