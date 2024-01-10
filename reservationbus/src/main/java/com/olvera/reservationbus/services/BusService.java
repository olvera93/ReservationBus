package com.olvera.reservationbus.services;

import com.olvera.reservationbus.entities.Bus;

import java.util.List;

public interface BusService {

    Bus addBus(Bus bus);

    List<Bus> getAllBus();

}
