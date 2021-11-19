package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.allOf;

@QuarkusTest
public class PetResourceTest {

	@Test
    public void testPetEP() {
        given()
          .when().get("/v1/pets")
          .then()
             .statusCode(200);           
    }
	
	@Test
    public void testDeletePetEP() {
        given()
          .when().delete("v1/pets/deletePet/1")
          .then()
             .statusCode(200);           
    }
	
//	@Test
//	public void testAddPetEP() {
//	    given()
//	      .when().post("v1/pets/addPet")
//	      .then()
//	         .statusCode(200);           
//	}
	
//	@Test
//  public void testUpdatePetEP() {
//      given()
//        .when().put("v1/pets/updatePet/1")
//        .then()
//           .statusCode(200);           
//  }
	
	
}