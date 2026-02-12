package edu.unisabana.pizzafactory.model;

public class PizzaDelgadaFactory implements PizzaFactory {

	public AmasadorPizza crearAmasador() {
		return new AmasadorPizzaDelgada();
	}

	public HorneadorPizza crearHorneador() {
		return new HorneadorPizzaDelgada();
	}

	public MoldeadorPizza crearMoldeador() {
		return new MoldeadorPizzaDelgada();
	}

}
