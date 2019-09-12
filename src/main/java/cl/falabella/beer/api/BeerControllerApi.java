package cl.falabella.beer.api;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import model.CurrencyModel;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.falabella.beer.api.model.Beer;
import cl.falabella.beer.api.model.BeerBox;

@RestController
@RequestMapping("beers")
public class BeerControllerApi {

	// Imposible hacer una aplicación con todos estos requerimientos en 40 minutos.
	
	@GetMapping()
	public ResponseEntity<List<Beer>> getAllBeers() {
		return ResponseEntity.ok(new ArrayList<Beer>()); // TODO implement
	}
	
	@GetMapping(name="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Beer> getBeerBydId(@PathParam(value = "id") Integer id) {
		return ResponseEntity.ok(new Beer()); // TODO implement
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Beer> addBeer() {
		return ResponseEntity.ok(new Beer()); // TODO implement
	}
	
	public ResponseEntity<BeerBox> getBeerBoxPrice(@RequestParam Integer quantity, CurrencyModel currencyModel) {
		return ResponseEntity.ok(new BeerBox()); // TODO implement
	}
	
}
