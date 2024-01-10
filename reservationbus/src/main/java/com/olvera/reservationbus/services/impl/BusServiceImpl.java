package com.olvera.reservationbus.services.impl;

import com.olvera.reservationbus.entities.Bus;
import com.olvera.reservationbus.repository.BusRepository;
import com.olvera.reservationbus.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }
}
