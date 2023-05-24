package controller;

import models.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.RolService;

@RestController
@RequestMapping("/roles")
@CrossOrigin("*")
public class RolController {

    @Autowired
    private RolService rolService;

    @PostMapping("/guardar")
    public ResponseEntity<Rol> guardar(@RequestBody Rol rol){
        return ResponseEntity.ok( rolService.guardar(rol));
    }
}
