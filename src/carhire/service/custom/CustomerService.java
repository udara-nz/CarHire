/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhire.service.custom;

import carhire.dto.CustomerDto;
import carhire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author UDARA DHANUSHKA
 */
public interface CustomerService extends SuperService{
    
    String addCustomer(CustomerDto customerDto) throws Exception;

    String updateCustomer(CustomerDto customerDto) throws Exception;

    String deleteCustomer(String id) throws Exception;

    //CustomerDto getCustomer(String id) throws Exception;

    //ArrayList<CustomerDto> getALLCustomer() throws Exception;
    
}
