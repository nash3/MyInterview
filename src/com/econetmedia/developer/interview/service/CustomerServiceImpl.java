/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.econetmedia.developer.interview.service;

import com.econetmedia.developer.interview.exception.ValidationException;
import com.econetmedia.developer.interview.model.Customer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * created by VimbainasheNhira on 25/10/2017
 */
public class CustomerServiceImpl implements CustomerService{
    
    
    @Override
    public boolean registerCustomer(Customer customer)
    {
        /**
         * @param registered to track if customer is successfully registered
         */
        boolean registered = false;
        //Set Collection to store registered customers and Avoid Duplicates
        Set<Customer> registeredCustomers = new HashSet<Customer>();
        
        //check if customer's name meets validation requirements
        if(customer.getFirstName().isEmpty() || customer.getFirstName() == null)
        {
            throw new ValidationException("Customer's first name can not be empty or null");
        }
        
        //check if customer's national ID meets validation requirements
        else if(customer.getNationalId().length() < 5 )
        {
             throw new ValidationException("Customer's National ID number length can not be less than 5");
        }
        
        else
        {
            
            //successfully register customer
            registeredCustomers.add(customer);
            
            registered = true;
            
            
        }
        
        return registered;
    }
    
    @Override
    public Optional<Customer> findCustomer(Long id){
         
        /**
         * @param customerInputList holds the list to search from
         * @param searchCustomer holds the value of the search result
         */
        Optional<Customer> searchCustomer = Optional.empty();
        
        
        List<Customer> customerInputList = new ArrayList<>();
        
        //check if there is a customer with the passed id
        customerInputList.stream().filter((customer) -> (Objects.equals(customer.getId(), id))).forEach((_item) -> {
            searchCustomer.isPresent();
        });
        
        return searchCustomer;
        
    }
    
    @Override
    public List<Customer> filterByGradeOrSalary(String grade,Number salary,List<Customer> customerInputList)
    {
        /**
         * @param customersBySalaryOrGrade stores customers that match filter criterion
         */
        List<Customer> customersBySalaryOrGrade = new ArrayList<Customer>();
        
        //Filter customers from list using grade or salary
        customerInputList.stream().filter((customer) -> (customer.getSalary() ==  salary || customer.getGrade().equals(grade))).forEach((customer) -> {
            customersBySalaryOrGrade.add(customer);
        });
        
        return customersBySalaryOrGrade;
        
    }
    
}
