
package io.danpalmer101.golftournament.api;

import java.util.List;
import io.danpalmer101.golftournament.api.model.CreateDrinkRequest;
import io.danpalmer101.golftournament.api.model.GetDrinkByIdResponse;
import io.danpalmer101.golftournament.api.model.GetDrinksResponse;
import io.danpalmer101.golftournament.api.model.UpdateDrinkByIdRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Provides interaction with 'Drink' resource
 * (Generated with springmvc-raml-parser v.0.8.6)
 * 
 */
@RestController
@RequestMapping(value = "/drinks", produces = "application/json")
public class DrinkControllerDecorator
    implements DrinkController
{

    @Autowired
    private DrinkController drinkControllerDelegate;

    /**
     * Retrieves a list of available drinks.
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<GetDrinksResponse>> getDrinks() {
        return this.drinkControllerDelegate.getDrinks();
    }

    /**
     * Creates a new drink.
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> createDrink(
        @javax.validation.Valid
        @org.springframework.web.bind.annotation.RequestBody
        CreateDrinkRequest createDrinkRequest) {
        return this.drinkControllerDelegate.createDrink(createDrinkRequest);
    }

    /**
     * Retrieves details for a specific drink.
     * 
     */
    @RequestMapping(value = "/{drinkName}", method = RequestMethod.GET)
    public ResponseEntity<GetDrinkByIdResponse> getDrinkById(
        @PathVariable
        String drinkName) {
        return this.drinkControllerDelegate.getDrinkById(drinkName);
    }

    /**
     * Modify an existing drink.
     * 
     */
    @RequestMapping(value = "/{drinkName}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateDrinkById(
        @PathVariable
        String drinkName,
        @javax.validation.Valid
        @org.springframework.web.bind.annotation.RequestBody
        UpdateDrinkByIdRequest updateDrinkByIdRequest) {
        return this.drinkControllerDelegate.updateDrinkById(drinkName, updateDrinkByIdRequest);
    }

    /**
     * Delete an existing drink.
     * 
     */
    @RequestMapping(value = "/{drinkName}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteDrinkById(
        @PathVariable
        String drinkName) {
        return this.drinkControllerDelegate.deleteDrinkById(drinkName);
    }

}
