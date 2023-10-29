package cibertec.edu.pe.DAWI_CL2_EDUARDOMOLINA.controller.administracion;

import cibertec.edu.pe.DAWI_CL2_EDUARDOMOLINA.service.FarmacoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/farmaco")
public class FarmacoController {

    private FarmacoService farmacoService;

    @GetMapping("/frmFarmaco")
    public String frmFarmaco(Model model){
        model.addAttribute("listafarmacos", farmacoService.listarFarmacos());
        return "administracion/frmFarmaco";
    }

}
