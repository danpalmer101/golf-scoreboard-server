
package io.danpalmer101.golftournament.api;

import io.danpalmer101.golftournament.api.model.GetHealthCheckResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Provides server health check
 * (Generated with springmvc-raml-parser v.0.8.6)
 * 
 */
@RestController
@RequestMapping(value = "/healthCheck", produces = "application/json")
public class HealthCheckControllerDecorator
    implements HealthCheckController
{

    @Autowired
    private HealthCheckController healthCheckControllerDelegate;

    /**
     * Retrieves the server's health status.
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<GetHealthCheckResponse> getHealthCheck() {
        return this.healthCheckControllerDelegate.getHealthCheck();
    }

}
