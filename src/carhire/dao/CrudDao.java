/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhire.dao;

import java.util.ArrayList;

/**
 *
 * @author UDARA DHANUSHKA
 */
public interface CrudDao {
    boolean add(T t)throws Exception;
    boolean update(T t)throws Exception;
    boolean delete(ID id)throws Exception;
    T get(ID id)throws Exception;
    ArrayList<T>  getall()throws Exception;

    public static class T {

        public T() {
        }
    }

    public static class ID {

        public ID() {
        }
    }
}
