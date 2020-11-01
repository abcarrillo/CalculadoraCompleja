package Vista;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends HBox {

	private ComboBox operacion;
	ObservableList<String> options = FXCollections.observableArrayList("+", "-", "x", "/");
	private TextField numeroRealA;
	private TextField numeroIA;
	private TextField numeroRealB;
	private TextField numeroIB;
	private TextField resultadoReal;
	private TextField resultadoI;
	private Button calcular;
	
	public Calculadora(){
		// TODO Auto-generated method stub

		VBox cajaOperaciones = new VBox();
		operacion = new ComboBox(options);
		operacion.getSelectionModel().select(0);
		cajaOperaciones.setAlignment(Pos.CENTER);
		cajaOperaciones.getChildren().addAll(operacion);
		
		
		HBox arriba = new HBox();
		arriba.setSpacing(3);
		Label plusA = new Label("+");
		Label iA = new Label("i");
		numeroRealA = new TextField();
		numeroRealA.setPrefWidth(40);
		numeroRealA.setText("0");
		numeroIA = new TextField();
		numeroIA.setPrefWidth(40);
		numeroIA.setText("0");
		arriba.getChildren().addAll(numeroRealA, plusA, numeroIA, iA);
		
		Separator sep = new Separator();
		
		HBox abajo = new HBox();
		Label plusB = new Label("+");
		Label iB = new Label("i");
		numeroRealB = new TextField();
		numeroRealB.setPrefWidth(40);
		numeroRealB.setText("0");
		numeroIB = new TextField();
		numeroIB.setPrefWidth(40);
		numeroIB.setText("0");
		abajo.setSpacing(3);
		abajo.getChildren().addAll(numeroRealB, plusB, numeroIB, iB);
		
		resultadoI = new TextField();
		resultadoReal = new TextField();
		resultadoReal.setDisable(true);
		resultadoReal.setText("0");
		resultadoI.setDisable(true);
		resultadoI.setPrefWidth(40);
		resultadoI.setText("0");
		resultadoReal.setPrefWidth(40);
		Label plusRe = new Label("+");
		Label resI = new Label("i");
		HBox resultadoCaja = new HBox();
		resultadoCaja.setSpacing(3);
		resultadoCaja.getChildren().addAll(resultadoReal, plusRe, resultadoI, resI);
		
		VBox textos = new VBox();
		textos.setSpacing(5);
		textos.setAlignment(Pos.CENTER);
		textos.getChildren().addAll(arriba, abajo, sep, resultadoCaja);
		
		calcular = new Button("=");
		VBox cajaBoton = new VBox();
		cajaBoton.setAlignment(Pos.CENTER);
		cajaBoton.getChildren().addAll(calcular);
		
		setSpacing(5);
		setAlignment(Pos.CENTER);
		getChildren().addAll(cajaOperaciones, textos, cajaBoton);
	}

	public ComboBox getOperacion() {
		return operacion;
	}

	public TextField getNumeroRealA() {
		return numeroRealA;
	}

	public TextField getNumeroIA() {
		return numeroIA;
	}

	public TextField getNumeroRealB() {
		return numeroRealB;
	}

	public TextField getNumeroIB() {
		return numeroIB;
	}

	public TextField getResultadoReal() {
		return resultadoReal;
	}

	public TextField getResultadoI() {
		return resultadoI;
	}

	public Button getCalcular() {
		return calcular;
	}

	
	

}
