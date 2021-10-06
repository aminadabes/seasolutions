package com.seasolutions.sea.controller;

import com.seasolutions.sea.model.Setor;
import com.seasolutions.sea.service.SetorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/seasolutions")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SetorController {

    private SetorService setorService;

    @PostMapping("/setor")
    public Setor save(@RequestBody Setor setor){
        return setorService.save(setor);
    }

    @GetMapping("/setor")
    public List<Setor> findAll(){
        return setorService.findAll();
    }
}
