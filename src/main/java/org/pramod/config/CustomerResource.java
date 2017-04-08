package org.pramod.config;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.pramod.model.Customer;
import org.pramod.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

@Path("customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces("application/json")
public class CustomerResource {
	
	@Autowired
	CustomerService customerService;

	@GET
    public List<Customer> getCustomers(){
    	return customerService.getAllCustomer();
    }
    
    @GET
    @Path("/{customerId}")
    public Customer getCustomer(@PathParam("customerId") int id){
    	return customerService.getCustomerById(id);
    }
    
    @POST
    @Path("/{customerId}/{customerfName}/{customerlName}/{emailId}/{phone}")
    public Customer saveCustomer(@PathParam("customerId") int id , @PathParam("customerfName")String f, @PathParam("customerlName") String l, @PathParam("emailId")String email,@PathParam("phone")String phone ){
    	Customer customer = new Customer();
    	customer.setFbId(id);
    	customer.setEmailId(email);
    	customer.setfName(f);
    	customer.setlName(l);
    	customer.setPhoneNumber(phone);
    	System.out.println("In save cust ***********************************");
    	return customerService.addCustomer(customer);
    }
    
    @PUT
    @Path("/{customerId}")
    public Customer updateCustomer(@PathParam("customerId") int id, Customer customer){
    	return customerService.updateCustomer(id, customer);
    }
    
    @DELETE
    @Path("/{customerId}")
    public Customer removeCustomer(@PathParam ("customerId") int id ){
    	return customerService.deleteCustomer(id);
    }
}
