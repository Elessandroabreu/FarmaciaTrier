package com.farmacia.elessandro.repository;

import com.farmacia.elessandro.model.CargoModel;
import com.farmacia.elessandro.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CargoRepository extends JpaRepository<CargoModel, Integer> {
    Optional<CargoModel> findByCdCargo(Integer cdCargo);
    Optional<CargoModel> findAllByCdCargo(Integer cdCargo);

}
