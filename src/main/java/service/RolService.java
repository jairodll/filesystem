package service;

import models.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RolRepository;

@Service

public class RolService {
    @Autowired
    private RolRepository rolRepository;

    public Rol guardar(Rol rol){
        return rolRepository.save(rol);
    }

    public Iterable<Rol> listar(){
        return rolRepository.findAll();
    }
}
