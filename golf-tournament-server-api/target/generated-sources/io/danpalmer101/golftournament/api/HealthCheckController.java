
package io.danpalmer101.golftournament.api;

import io.danpalmer101.golftournament.api.model.GetHealthCheckResponse;
import org.springframework.http.ResponseEntity;


/**
 * Provides server health check
 * (Generated with springmvc-raml-parser v.0.8.6)
 * 
 */
public interface HealthCheckController {


    /**
     * Retrieves the server's health status.
     * 
     */
    public ResponseEntity<GetHealthCheckResponse> getHealthCheck();

}
