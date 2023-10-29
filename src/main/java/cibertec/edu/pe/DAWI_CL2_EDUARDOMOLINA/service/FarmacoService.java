package cibertec.edu.pe.DAWI_CL2_EDUARDOMOLINA.service;

import cibertec.edu.pe.DAWI_CL2_EDUARDOMOLINA.model.bd.Farmaco;
import cibertec.edu.pe.DAWI_CL2_EDUARDOMOLINA.repository.FarmacoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FarmacoService {

    private FarmacoRepository farmacoRepository;

    public List<Farmaco> listarFarmacos(){
        return farmacoRepository.findAll();
    }

    public boolean registrarFarmaco(Farmaco farmaco){
        return farmacoRepository.save(farmaco) != null;
    }

    public void eliminarFarmaco(Integer idfarmaco){
        farmacoRepository.deleteById(idfarmaco);
    }



}

