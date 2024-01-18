package com.olvera.reservationbus.services.impl;

import com.olvera.reservationbus.entities.BusRoute;
import com.olvera.reservationbus.entities.BusSchedule;
import com.olvera.reservationbus.model.ReservationApiException;
import com.olvera.reservationbus.repository.BusRouteRepository;
import com.olvera.reservationbus.repository.BusScheduleRepository;
import com.olvera.reservationbus.services.BusScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusScheduleServiceImpl implements BusScheduleService {

    @Autowired
    private BusScheduleRepository busScheduleRepository;

    @Autowired
    private BusRouteRepository busRouteRepository;

    @Override
    public BusSchedule addSchedule(BusSchedule busSchedule) throws ReservationApiException {
        final boolean exists =
                busScheduleRepository.existsByBusAndBusRouteAndDepartureTime(
                        busSchedule.getBus(),
                        busSchedule.getBusRoute(),
                        busSchedule.getDepartureTime()
                );

        if (exists) {
            throw new ReservationApiException(HttpStatus.CONFLICT, "Duplicate ");
        }

        return busScheduleRepository.save(busSchedule);
    }

    @Override
    public List<BusSchedule> getAllBusSchedule() {
        return busScheduleRepository.findAll();
    }

    @Override
    public List<BusSchedule> getSchedulesByRoute(String routeName) {
        final BusRoute busRoute = busRouteRepository.findByRouteName(routeName)
                .orElseThrow(() -> new ReservationApiException(HttpStatus.BAD_REQUEST, "Not Found"));
        return busScheduleRepository.findByBusRoute(busRoute)
                .orElseThrow(() -> new ReservationApiException(HttpStatus.BAD_REQUEST, "Not Found"));
    }
}
