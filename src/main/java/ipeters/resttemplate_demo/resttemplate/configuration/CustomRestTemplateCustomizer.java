package ipeters.resttemplate_demo.resttemplate.configuration;

/* carlpeters created on 17/12/2024 inside the package - ipeters.resttemplate_demo.resttemplate.configuration */
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.web.client.RestTemplate;

/**
 * customize rest template with an interceptor
 */
public class CustomRestTemplateCustomizer implements RestTemplateCustomizer {
    @Override
    public void customize(RestTemplate restTemplate) {
        restTemplate.getInterceptors().add(new CustomClientHttpRequestInterceptor());
    }
}
