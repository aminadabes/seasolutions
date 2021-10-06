package com.seasolutions.sea.service;

import com.seasolutions.sea.model.Cargo;
import com.seasolutions.sea.repository.CargoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CargoService {

    private CargoRepository cargoRepository;

    public Cargo save(Cargo cargo){
        return cargoRepository.save(cargo);
    }

    public List<Cargo> findAll(){
        return cargoRepository.findAll();
    }
}
