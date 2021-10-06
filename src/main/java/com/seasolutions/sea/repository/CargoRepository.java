package com.seasolutions.sea.repository;

import com.seasolutions.sea.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo,Long> {
}
