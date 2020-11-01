package controller;

import Modelo.Complejo;
import Vista.Calculadora;
import javafx.event.ActionEvent;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class CalcController {
	
	StringConverter<Number> converter = new NumberStringConverter();
	Calculadora pantalla = new Calculadora();
	Complejo a = new Complejo(0,0);
	Complejo b = new Complejo(0,0);
	
	public CalcController() {
		try {
			pantalla.getNumeroRealA().textProperty().bindBidirectional(a.realProperty(), converter);
			pantalla.getNumeroIA().textProperty().bindBidirectional(a.imaginarioProperty(), converter);
			pantalla.getNumeroRealB().textProperty().bindBidirectional(b.realProperty(), converter);
			pantalla.getNumeroIB().textProperty().bindBidirectional(b.imaginarioProperty(), converter);
			
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		pantalla.getCalcular().setOnAction(e ->{
			calcularOnAction(e);
		});
	}
	
	public void calcularOnAction(ActionEvent e) {
		String operacion = pantalla.getOperacion().getSelectionModel().getSelectedItem().toString();
		Complejo resultado = new Complejo(0,0);
		
		switch (operacion) {
		case "+": {
			resultado = Complejo.sumarComplejos(a, b);
			break;
		}
		case "-": {
			resultado = Complejo.restarComplejos(a, b);
			break;
		}
		case "x": {
			resultado = Complejo.multiplicarComplejos(a, b);
			break;
		}
		case "/": {
			resultado = Complejo.dividirComplejos(a, b);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operacion);
		}
		
		pantalla.getResultadoReal().setText(resultado.getReal()+"");
		pantalla.getResultadoI().setText(resultado.getImaginario()+"");
	}

	public Calculadora getPantalla() {
		return pantalla;
	}


	
	
}
