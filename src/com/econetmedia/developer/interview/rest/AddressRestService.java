/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.econetmedia.developer.interview.rest;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * created by VimbainasheNhira on 25/10/2017
 */

@Path("/myrestservice")
public class AddressRestService {
    @Path("/address")
    @POST
    @Consumes(MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON)
    public String getBothResponse(Address add) throws IOException
    {
        //log the data to a file
        java.nio.file.Path outputFilePath = Paths.get("//data//naruto//log//MyInterview.log");
        Files.write(outputFilePath, add.toString().getBytes(), StandardOpenOption.CREATE_NEW);
        
        RestConsumerImplementation restConsumerImpl = new RestConsumerImplementation();
        restConsumerImpl.makeRestCall(1);
        
         ClientResponse response = resource.accept("application/json")
        .get(ClientResponse.class);
         
         String output = response.getEntity(String.class);
         
         //Print output to console
         System.out.println(output);
        
        
        return null;
    }
    
    
}
