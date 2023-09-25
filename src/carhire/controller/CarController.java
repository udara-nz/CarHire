/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.controller;

import carhire.service.ServiceFactory;
import carhire.service.custom.CarService;
import carhire.dto.CarDto;
import java.util.ArrayList;

/**
 *
 * @author UDARA DHANUSHKA
 */
public class CarController {
    CarService carService = (CarService) ServiceFactory.getIntance().getService(ServiceFactory.ServiceType.Car);
    
    public String addCar(CarDto carDto) throws Exception {
        return carService.addCar(CarDto);
    }

    //public ArrayList<CarDto> getAllItem() throws Exception {
        //return carService.getAllItem();
    //}

    public String updateCar(CarDto carDto) throws Exception {
        return carService.updateCar(carDto);
    }

    public String deleteCar(String id) throws Exception {
        return carService.deleteCar(id);
    }

    //public ItemDto getItem(String custId) throws Exception {
        //return itemService.getItem(custId);
    //}
}
