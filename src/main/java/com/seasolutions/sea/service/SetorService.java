package com.seasolutions.sea.service;

import com.seasolutions.sea.model.Setor;
import com.seasolutions.sea.repository.SetorRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SetorService {

    private SetorRepository setorRepository;

    public Setor save(Setor setor){
        return setorRepository.save(setor);
    }

    public List<Setor> findAll(){
        return setorRepository.findAll();
    }

}
