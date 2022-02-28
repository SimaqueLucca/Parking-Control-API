package com.api.parkingcontrol.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Document(collection = "TB_PARKING_SPOT")
public class ParkingSpotModel {

    @MongoId(value = FieldType.OBJECT_ID)
    private String id;

    @NotNull(message = "Field parkingSpotNumber cannot be null")
    private String parkingSpotNumber;
    @NotNull(message = "Field licensePlateCar cannot be null")
    private String licensePlateCar;
    @NotNull(message = "Field brandCar cannot be null")
    private String brandCar;
    @NotNull(message = "Field modelCar cannot be null")
    private String modelCar;
    @NotNull(message = "Field colorCar cannot be null")
    private String colorCar;
    @NotNull(message = "Field registrationDate cannot be null")
    private LocalDateTime registrationDate;
    @NotNull(message = "Field responsibleName cannot be null")
    private String responsibleName;
    @NotNull(message = "Field apartment cannot be null")
    private String apartment;
    @NotNull(message = "Field block cannot be null")
    private String block;
}
