package edu.unisabana.pizzafactory.model;

public class PizzaIntegralFactory implements PizzaFactory {

	public AmasadorPizza crearAmasador() {
		return new AmasadorPizzaIntegral();
	}

	public HorneadorPizza crearHorneador() {
		return new HorneadorPizzaIntegral();
	}

	public MoldeadorPizza crearMoldeador() {
		return new MoldeadorPizzaIntegral();
	}

}
