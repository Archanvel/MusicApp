package net.example.cheltuieapp.controller;

import net.example.cheltuieapp.model.Cheltuieli;
import net.example.cheltuieapp.service.CheltuieliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class CheltuieliController {
    private CheltuieliService cheltuieliService;

    @Autowired
    public CheltuieliController(CheltuieliService cheltuieliService) {
        this.cheltuieliService = cheltuieliService;
    }

    @GetMapping("/cheltuieli")
    public String getAll(Model model){
        List<Cheltuieli> cheltuielis = cheltuieliService.getAll();
        model.addAttribute("cheltuielis", cheltuielis);
        return "cheltuieli-list";
    }
}
