package ipeters.resttemplate_demo.resttemplate.controller;


// Importing required classes
import ipeters.resttemplate_demo.resttemplate.model.UserData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class RestTemplateProvider {

    // Creating an instance of RestTemplate class
    RestTemplate rest = new RestTemplate();

    // Method
    public UserData getUserData()
    {
        log.debug("In RestTemplateProvider.getUserData()");
        return rest.getForObject(
                "http://localhost:8686/resttemplatedemo/RestApi/getData",
                UserData.class);
    }

    // Method
    public ResponseEntity<UserData> post(UserData user)
    {
        log.debug("In RestTemplateProvider.post()");
        return rest.postForEntity(
                "http://localhost:8686/resttemplatedemo/RestApi", user,
                UserData.class, "");
    }
}