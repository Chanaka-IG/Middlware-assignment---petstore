
----- API ----------


get all pets
http://localhost:8080/v1/pets/

get a pet by using ID
http://localhost:8080/v1/pets/id/1

add a pet
http://localhost:8080/v1/pets/addPet
	
update a pet  
http://localhost:8080/v1/pets/updatePet/1
	
delete a pet  
http://localhost:8080/v1/pets/deletePet/1


------ run test suit --------

./gradlew test


-------Curl commands --------

get all pets
curl -X GET http://localhost:8080/v1/pets

add a pet
curl -X POST "http://localhost:8080/v1/pets/addPet" -H "Content-Type: application/json" --data-raw "{\"petAge\": 1,\"petId\": 1,\"petName\": \"New Pet\",\"petType\": \"New Type\"}"

To update a pet  
curl -X PUT "http://localhost:8080/v1/pets/updatePet/1" -H "Content-Type: application/json" --data-raw "{\"petAge\": 7,\"petId\": 1,\"petName\": \"Update Pet\",\"petType\": \"Update Type\"}"

To delete a pet  
curl -X DELETE "http://localhost:8080/v1/pets/deletePet/1"


