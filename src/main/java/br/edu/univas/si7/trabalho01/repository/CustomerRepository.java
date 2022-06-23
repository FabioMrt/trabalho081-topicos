package br.edu.univas.si7.trabalho01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.univas.si7.trabalho01.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    @Transactional(readOnly = true)
    Customer findByEmail(String email);

}
