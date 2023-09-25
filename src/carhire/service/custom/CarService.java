/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhire.service.custom;

import carhire.dto.CarDto;

/**
 *
 * @author UDARA DHANUSHKA
 */
public interface CarService {

    public String updateCar(CarDto carDto);

    public String deleteCar(String id);

    public String addCar(CarDto carDto);
    
}
