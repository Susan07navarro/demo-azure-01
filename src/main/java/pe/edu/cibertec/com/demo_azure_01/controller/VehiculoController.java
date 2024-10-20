package pe.edu.cibertec.com.demo_azure_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.com.demo_azure_01.viewmodel.VehiculoModel;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoController {
    @GetMapping("/")
    public String ObtenerVehiculos(Model model){
        List<VehiculoModel> listaVehiculos = new ArrayList<VehiculoModel>();
        listaVehiculos.add(new VehiculoModel(1,"Kia","Sports Car","verde","BTT456"));


        model.addAttribute("listaVehiculos", listaVehiculos);
        return "vehiculo";
    }
}
