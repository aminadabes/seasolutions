package com.seasolutions.sea.controller;

import com.seasolutions.sea.model.Cargo;
import com.seasolutions.sea.service.CargoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("seasolutions")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CargoController {

    private CargoService cargoService;

    @PostMapping("/cargo")
    public Cargo save(@RequestBody Cargo cargo){
        return cargoService.save(cargo);
    }

    @GetMapping("/cargo")
    public List<Cargo> findAdll(){
        return cargoService.findAll();
    }
}
