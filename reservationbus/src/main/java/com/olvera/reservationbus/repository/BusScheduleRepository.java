package com.olvera.reservationbus.repository;

import com.olvera.reservationbus.entities.Bus;
import com.olvera.reservationbus.entities.BusRoute;
import com.olvera.reservationbus.entities.BusSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BusScheduleRepository extends JpaRepository<BusSchedule, Long> {

    Optional<List<BusSchedule>> findByBusRoute(BusRoute busRoute);

    Boolean existsByBusAndBusRouteAndDepartureTime(Bus bus, BusRoute busRoute, String date);

}
