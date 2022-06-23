package br.edu.univas.si7.trabalho01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.univas.si7.trabalho01.model.Customer;
import br.edu.univas.si7.trabalho01.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Transactional(readOnly = true)
    List<Order> findByCustomer(Customer customer);
}
