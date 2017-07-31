
package io.danpalmer101.golftournament.api;

import java.util.List;
import io.danpalmer101.golftournament.api.model.CreateDrinkRequest;
import io.danpalmer101.golftournament.api.model.GetDrinkByIdResponse;
import io.danpalmer101.golftournament.api.model.GetDrinksResponse;
import io.danpalmer101.golftournament.api.model.UpdateDrinkByIdRequest;
import org.springframework.http.ResponseEntity;


/**
 * Provides interaction with 'Drink' resource
 * (Generated with springmvc-raml-parser v.0.8.6)
 * 
 */
public interface DrinkController {


    /**
     * Retrieves a list of available drinks.
     * 
     */
    public ResponseEntity<List<GetDrinksResponse>> getDrinks();

    /**
     * Creates a new drink.
     * 
     */
    public ResponseEntity<?> createDrink(CreateDrinkRequest createDrinkRequest);

    /**
     * Retrieves details for a specific drink.
     * 
     */
    public ResponseEntity<GetDrinkByIdResponse> getDrinkById(String drinkName);

    /**
     * Modify an existing drink.
     * 
     */
    public ResponseEntity<?> updateDrinkById(String drinkName, UpdateDrinkByIdRequest updateDrinkByIdRequest);

    /**
     * Delete an existing drink.
     * 
     */
    public ResponseEntity<?> deleteDrinkById(String drinkName);

}
