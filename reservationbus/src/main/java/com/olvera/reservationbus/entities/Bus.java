package com.olvera.reservationbus.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bus {

    private Long busId;

    private String busName;

    private String busType;

    private Integer totalSeat;

    private String busNumber;

}
