package qaautomation.may2022;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITesting {
	@Test
	public void getAllProducts() {
		RestAssured.baseURI = "https://fakestoreapi.com";
		Response responseProducts = RestAssured.given().contentType("application/json").when().get("/products");
		assertEquals(responseProducts.statusCode(), 200);
		System.out.println(responseProducts.asPrettyString());
	}
	
	@Test
	public void getAllCategories() {
		RestAssured.baseURI = "https://fakestoreapi.com";
		Response responseCategories = RestAssured.given().contentType("application/json").when().get("/products/categories");
		assertEquals(responseCategories.statusCode(), 200);
		System.out.println(responseCategories.asPrettyString());
	}
}
	