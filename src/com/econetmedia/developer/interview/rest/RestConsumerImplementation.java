/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.econetmedia.developer.interview.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
/**
 *
 * created by VimbainasheNhira on 25/10/2017
 */
public class RestConsumerImplementation implements RestConsumer{
    
    @Override
    //Method to populate SampleRestObject from client response class
    public SampleRestObject makeRestCall(int postId)
    {
        Client client = Client.create();
        
        //URL to the posts resource
	WebResource resource = client.resource("http://jsonplaceholder.typicode.com/posts/" + postId);
        
        //GET the response in JSON format
        ClientResponse response = resource.accept("application/json")
        .get(ClientResponse.class);
		
        
        //check if the request was successul else throw exception
        if (response.getStatus() != 200) {
                   throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
                }
        
        //Specify the XmlRootElement class to map the results to and return them as Jason
        
        return response.getEntity(SampleRestObject.class);
                
    }
    
}
