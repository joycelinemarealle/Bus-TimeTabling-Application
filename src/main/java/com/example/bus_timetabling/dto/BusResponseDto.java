package com.example.bus_timetabling.dto;

import com.example.bus_timetabling.enums.Service;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class BusResponseDto {
    private Long id;
    private String busNumber;
    private Service status;
    private Long toStopId;
    private Long fromStopId;
    private Long route_schedule_Id;

}