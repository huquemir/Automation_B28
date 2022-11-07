package com.smarttechqa.apistepdef;

import java.util.LinkedHashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ProductApiStepDef {
	
	
	static String domain = "https://www.smarttechqa.com";


	@Given("User generates a token")
	public void user_generates_a_token() {
		RestAssured.baseURI = domain;
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type", "application/json");
		
		//Since we have to login and generate the token, we have to send a body with the request
		
		Map <String, String> data = new LinkedHashMap<>();
		data.put("email", "apiuser@email.com");
		data.put("password", "api123");
		
		JSONObject obj = new JSONObject(data);
		String json = obj.toJSONString();
		//Sending a request with payload which is the json, Type of Method, PATH
		Response response = req.body(json).request(Method.POST, "/api/users/login");
		String token = response.jsonPath().get("token");
		System.out.println(token);
		//After we send the payload wit the email and password, we will get back the token
		//and the value. But we only need the value. There is a method that extracts the value
		//from the json body which is called jsonPath
	}

	@When("Get method is used for endpoint")
	public void get_method_is_used_for_endpoint() {
			
		
	}

	@Then("All the products are retrieved")
	public void all_the_products_are_retrieved() {
	    
	}

	@Then("The status code is {int} Ok")
	public void the_status_code_is_ok(int actual) {
		
		
	}

	@Then("The response time is below {int} ms")
	public void the_response_time_is_below_ms(long time) {
		 
	    
	}

	@When("Post method is used for endpoint")
	public void post_method_is_used_for_endpoint() {
		
		
				    
	}

	@Then("Sample product is posted to the application")
	public void sample_product_is_posted_to_the_application() {
		
	    
	}

	@Then("The status code is {int} Created")
	public void the_status_code_is_created(int code) {
		
	}

	@When("Put method is used for endpoint")
	public void put_method_is_used_for_endpoint() {
		
	    
	}

	@Then("Sample product is updated in the application")
	public void sample_product_is_updated_in_the_application() {
	 
	    
	}


	@When("Delete method is used for endpoint")
	public void delete_method_is_used_for_endpoint() {
		
	}

	@Then("Sample product is removed from the application")
	public void sample_product_is_removed_from_the_application() {
	    
	    
	    
	}

	
	
	
}
