package qaautomation.may2022;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;

public class APITest {
	Faker faker = new Faker();
	
	@Test
	public void register() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		String payload = "{\"username\" : \"" + faker.name().username() + "\",\"email\" : \"chenlaurr@gmail.com\",\"password\" : \"kolak000\",\"phonenumber\" : \""+ faker.phoneNumber() +"\"}";
		Response responseRegister = RestAssured.given().contentType("application/json").body(payload).when().post("/register");
		assertEquals(responseRegister.statusCode(), 201);
		assertEquals(responseRegister.jsonPath().get("Status"), "Created");
		assertEquals(responseRegister.jsonPath().get("Message"), "New User Registered");
	}
	
}
	