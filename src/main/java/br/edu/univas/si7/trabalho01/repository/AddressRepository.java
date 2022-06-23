package br.edu.univas.si7.trabalho01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.univas.si7.trabalho01.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    
}
