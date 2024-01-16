package com.olvera.reservationbus.services;

import com.olvera.reservationbus.entities.BusSchedule;

import java.util.List;

public interface BusScheduleService {

    BusSchedule addSchedule(BusSchedule busSchedule);

    List<BusSchedule> getAllBusSchedule();

    List<BusSchedule> getSchedulesByRoute(String routeName);



}
