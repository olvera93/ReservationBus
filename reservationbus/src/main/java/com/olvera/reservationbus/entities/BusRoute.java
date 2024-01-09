package com.olvera.reservationbus.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BusRoute {

    private Long routeId;

    private String routeName;

    private String cityFrom;

    private String cityTo;

    private Double distanceInKm;

}
