/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.dto;

/**
 *
 * @author UDARA DHANUSHKA
 */
public class CarDto {
    private String id;
    private String model;
    private String vehicleNumber;
    private String brand;
    private String yom;
    private Double pricePerDay;

    
    public CarDto(String id, String model, String vehicleNumber, String brand, String yom, Double pricePerDay) {
        this.id = id;
        this.model = model;
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.yom = yom;
        this.pricePerDay = pricePerDay;
}
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the vehicleNumber
     */
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    /**
     * @param vehicleNumber the vehicleNumber to set
     */
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the yom
     */
    public String getYom() {
        return yom;
    }

    /**
     * @param yom the yom to set
     */
    public void setYom(String yom) {
        this.yom = yom;
    }

    /**
     * @return the pricePerDay
     */
    public Double getPricePerDay() {
        return pricePerDay;
    }

    /**
     * @param pricePerDay the pricePerDay to set
     */
    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "CarDto{" + "id=" + id + ", model=" + model + ", vehicleNumber=" + vehicleNumber + ", brand=" + brand + ", yom=" + yom + ", pricePerDay=" + pricePerDay + '}';
    }
    
    
}



