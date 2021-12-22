package net.example.cheltuieapp.service;

import net.example.cheltuieapp.model.Cheltuieli;
import net.example.cheltuieapp.repository.CheltuieliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheltuieliService {
    private CheltuieliRepository cheltuieliRepository;


    @Autowired
    public CheltuieliService(CheltuieliRepository cheltuieliRepository) {
        this.cheltuieliRepository = cheltuieliRepository;
    }
    public Cheltuieli getById(Long idcec){
        return cheltuieliRepository.findById(idcec).orElse(null);
    }
    public List<Cheltuieli> getAll(){
        return cheltuieliRepository.findAll();
    }
}
