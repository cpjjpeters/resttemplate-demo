package ipeters.resttemplate_demo.resttemplate.web.service;

/* carlpeters created on 17/12/2024 inside the package - ipeters.resttemplate_demo.resttemplate.web.service */

import ipeters.resttemplate_demo.resttemplate.web.dto.UserData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

// Class
public class RestTemplateProvider {

    // Creating an instance of RestTemplate class
    RestTemplate rest = new RestTemplate();

    // Method
    public UserData getUserData()
    {
        return rest.getForObject(
                "http://localhost:8686/RestApi/getData",
                UserData.class);
    }

    // Method
    public ResponseEntity<UserData> post(UserData user)
    {
        return rest.postForEntity(
                "http://localhost:8686/RestApi", user,
                UserData.class, "");
    }
}
