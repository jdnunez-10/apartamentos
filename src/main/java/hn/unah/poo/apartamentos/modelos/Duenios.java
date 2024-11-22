package hn.unah.poo.apartamentos.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "duenios")
public class Duenios {

    @Id
    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;

@OneToMany
@JoinColumn(name = "dni",referencedColumnName = "dni")
    private Condominios condominios;
}
