/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.service;

import carhire.service.custom.impl.CustomerServiceImpl;
import carhire.service.custom.impl.CarServiceImpl;
import carhire.service.custom.impl.CategoryServiceImpl;

/**
 *
 * @author UDARA DHANUSHKA
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getIntance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }

        return serviceFactory;
    }

    public SuperService getService(ServiceType type) {
        switch (type) {
            case CUSTOMER:
                return new CustomerServiceImpl();

            case CAR:
                return (SuperService) new CarServiceImpl();
                
            case CATEGORY:
                return new CategoryServiceImpl();

            default:
                return null;
        }
    }

    public enum ServiceType {
        CUSTOMER, CAR, CATEGORY
    }

    
    }
    
