package Learning;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.Payload;
import files.ReusableMethods;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
	//Create place using post	
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(Payload.addPlace()).when().post("/maps/api/place/add/json").then().assertThat()
		.statusCode(200).body("scope", equalTo("APP")).header("server", "Apache/2.4.18 (Ubuntu)").extract().asString();

	System.out.println("Response is "+response);
	
	JsonPath js= new JsonPath(response);
	 String placeId=js.get("place_id");
	
	System.out.println("Place id is "+placeId);
	
	//Update place using put
	System.out.println("====================================================================");
	
	String newAddress="70 Summer walk, USA";
	given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body("{\r\n" + 
			"\"place_id\":\""+placeId+"\",\r\n" + 
			"\"address\":\""+newAddress+"\",\r\n" + 
			"\"key\":\"qaclick123\"\r\n" + 
			"}\r\n" + 
			"").when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
	
	
	//get api
	System.out.println("====================================================================");
	String getPlaceResponse=given().log().all().queryParam("key","qaclick123").queryParam("place_id", placeId).when().get("/maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().asString();
	JsonPath js1= ReusableMethods.rawToJason(getPlaceResponse);
	String actualAddress=js1.get("address");
	
	System.out.println("Address is "+actualAddress);
	
	Assert.assertEquals(actualAddress, newAddress);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

	
	

}
