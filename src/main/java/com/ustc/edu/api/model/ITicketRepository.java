package com.ustc.edu.api.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITicketRepository extends JpaRepository<Ticket,Integer> {
    // nothing todo
}
