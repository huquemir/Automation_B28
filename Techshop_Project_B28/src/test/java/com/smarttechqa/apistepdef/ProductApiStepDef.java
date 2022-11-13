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

	static String token;
	static Response response;
	static String item;
	static Response resPost;
	static Response resPut;
	static Response resDel;

	@Given("User generates a token")
	public void user_generates_a_token() {
		RestAssured.baseURI = domain;
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type", "application/json");
		
		Map <String, String> data = new LinkedHashMap<>();
		data.put("email", "apiuser@email.com");
		data.put("password", "api123");
		//Sending a request with payload which is the json, Type of Method, PATH
		JSONObject obj = new JSONObject(data);
		String json = obj.toJSONString();
		
		response = req.body(json).request(Method.POST, "/api/users/login");
		token = response.jsonPath().get("token"); //You have to put the key then it gives you back the value
		
		//System.out.println("The token value is : "+token);
		//After we send the payload wit the email and password, we will get back the token
		//and the value. But we only need the value. There is a method that extracts the value
		//from the json body which is called jsonPath
		
		//System.out.println("This is in the creation "+token);

	}

	//Code for Get Method
	@When("Get method is used for endpoint")
	public void get_method_is_used_for_endpoint() {
		RestAssured.baseURI = domain;
		RequestSpecification req = RestAssured.given();
		response = req.request(Method.GET, "/api/products");	
		
	}

	@Then("All the products are retrieved")
	public void all_the_products_are_retrieved() {
	    //Assert.assertTrue(res.prettyPrint().contains("products"));
		  //We have to assert that the json response contains the key of products.
		//RestAssured has some built(pre-defined) in methods for assertion 
		response.then().assertThat().body(Matchers.containsString("products"));
		System.out.println(response.prettyPrint());
	}

	@Then("The status code is {int} Ok")
	public void the_status_code_is_ok(int actual) {
		Assert.assertEquals(actual, response.getStatusCode());
		
	}

	@Then("The response time is below {int} ms")
	public void the_response_time_is_below_ms(long time) {
		response.then().assertThat().time(Matchers.lessThan(time)); 
	    
	}
	//Code for POST Method
	@When("Post method is used for endpoint")
	public void post_method_is_used_for_endpoint() {
		
		RestAssured.baseURI = domain;
		RequestSpecification req = RestAssured.given();
		req.header("Authorization", "Bearer " + token)
		.header("Content-Type", "application/json; charset=utf-8");
		
		Map <String,String>update = new LinkedHashMap<>();
		update.put("name", "Sample name");
		update.put("price", "0");
		update.put("image", "/images/sample.jpg");
		update.put("brand", "Sample brand");
		update.put("category", "Sample category");
		update.put("countInStock", "0");
		update.put("numReviews", "0");
		update.put("description", "Sample description");
		
		JSONObject object = new JSONObject(update);
		String jsonBody = object.toJSONString();
		
		resPost = req.body(jsonBody).request(Method.POST, "/api/products");	
		item = resPost.jsonPath().get("_id");	
				    
	}

	@Then("Sample product is posted to the application")
	public void sample_product_is_posted_to_the_application() {
		System.out.println("The id of the item is : "+item);
		resPost.then().assertThat().body(Matchers.containsString("Sample"));
	    
	}

	@Then("The status code is {int} Created")
	public void the_status_code_is_created(int code) {
		resPost.then().assertThat().statusCode(code);
		//Assert.assertEquals(code, resPost.getStatusCode());
	}

	//Code for PUT Method
	@When("Put method is used for endpoint")
	public void put_method_is_used_for_endpoint() {
		RestAssured.baseURI = domain;
		RequestSpecification req = RestAssured.given();
		req.header("Authorization", "Bearer " + token)
		.header("Content-Type", "application/json; charset=utf-8");
		
		Map update = new LinkedHashMap();
		update.put("name", "Television");
		update.put("price", "4000");
		update.put("image", "/images/sample.jpg");
		update.put("brand", "LG");
		update.put("category", "Electronics");
		update.put("countInStock", "5");
		update.put("numReviews", "0");
		update.put("description", "LG television");
		
		
		JSONObject object = new JSONObject(update);
		String jsonBody = object.toJSONString();
		
		resPut = req.body(jsonBody).request(Method.PUT, "/api/products/"+item);
		System.out.println(resPut.asString());
	    
	}

	@Then("Sample product is updated in the application")
	public void sample_product_is_updated_in_the_application() {
	    int expected = 5;
		int actual = resPut.jsonPath().get("countInStock");
		Assert.assertEquals(actual, expected);
		
	
	}

	//Code for DELETE Method
	@When("Delete method is used for endpoint")
	public void delete_method_is_used_for_endpoint() {
		RestAssured.baseURI = domain;
		RequestSpecification req = RestAssured.given();
		req.header("Authorization", "Bearer " + token);
		//.header("Content-Type", "application/json; charset=utf-8");
		
		resDel = req.request(Method.DELETE, "/api/products/"+item);
	    //System.out.println(resDel.getBody().asString());
	}

	@Then("Sample product is removed from the application")
	public void sample_product_is_removed_from_the_application() {
	    String expected = "Product removed";
	    String actual = resDel.jsonPath().get("message");
	    Assert.assertEquals(actual, expected);
	    
	    
	}
	
}
	
