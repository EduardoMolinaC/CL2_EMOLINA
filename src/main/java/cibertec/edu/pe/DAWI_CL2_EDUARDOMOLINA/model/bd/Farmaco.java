package cibertec.edu.pe.DAWI_CL2_EDUARDOMOLINA.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.text.DecimalFormat;
@Entity
@Table(name = "farmaco")
@Data
public class Farmaco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idfarmaco;
    @Column(name = "nomfarmaco")
    private String nomfarmaco;
    @Column(name = "precio")
    private DecimalFormat precio;

}
