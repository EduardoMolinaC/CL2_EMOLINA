package cibertec.edu.pe.DAWI_CL2_EDUARDOMOLINA.repository;

import cibertec.edu.pe.DAWI_CL2_EDUARDOMOLINA.model.bd.Farmaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmacoRepository  extends JpaRepository <
    Farmaco,Integer>
{

}
