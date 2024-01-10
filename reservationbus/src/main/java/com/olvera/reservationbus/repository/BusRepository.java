package com.olvera.reservationbus.repository;

import com.olvera.reservationbus.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
