/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.service.custom.impl;

import carhire.dto.CustomerDto;
import carhire.service.custom.CustomerService;
import java.util.ArrayList;
import carhire.entity.CustomerEntity;
import carhire.dao.DaoFactory;
import carhire.dao.custom.CustomerDao;

public class CustomerServiceImpl implements CustomerService


    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    public String addCustomer(CustomerDto dto) throws Exception {

        CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getTitile(),
                dto.getName(), dto.getNIC(), dto.getPhone(),
                dto.getAddress(), dto.getCity(), dto.getProvince(),
                dto.getZip());

        if (customerDao.add(ce)) {
            return "Successfully Added";

        } else {
            return "Fail";
        }

    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
       CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getTitile(),
                dto.getName(), dto.getNIC(), dto.getPhone(),
                dto.getAddress(), dto.getCity(), dto.getProvince(),
                dto.getZip());

        if (customerDao.update(ce)) {
            return "Successfully Update";

        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
         if (customerDao.delete(id)) {
            return "Successfully Delete";

        } else {
            return "Fail";
        }
       
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        return new CustomerDto(entity.getId(), entity.getTitile(),
                entity.getName(), entity.getNIC(), entity.getPhone(),
                entity.getAddress(), entity.getCity(), entity.getProvince(),
                entity.getZip());
       
    }

    @Override
    public ArrayList<CustomerDto> getALLCustomer() throws Exception {
       ArrayList<CustomerDto> customerDtos = new ArrayList<>();
       ArrayList<CustomerEntity> customerEntitys = customerDao.getall();
       
        for (CustomerEntity entity : customerEntitys) {
            CustomerDto dto = new CustomerDto(entity.getId(), entity.getTitile(),
                entity.getName(), entity.getNIC(), entity.getPhone(),
                entity.getAddress(), entity.getCity(), entity.getProvince(),
                entity.getZip());

            customerDtos.add(dto);
            
        }
            
        return customerDtos;
       
    }

}
