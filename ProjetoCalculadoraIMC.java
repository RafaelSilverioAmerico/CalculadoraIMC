import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ProjetoCalculadoraIMC extends Application{
	
	@Override
	public void start(Stage palco){

	// Etiquetas para os campos de entrada
	Label etiquetaPeso = new Label("Peso");
	Label etiquetaAltura = new Label("Altura");

	// Campos de texto para entrada de dados
	TextField campoPeso = new TextField();
	campoPeso.setPromptText("Peso em kg");
	TextField campoAltura = new TextField();
	campoAltura.setPromptText("Altura em metros");

	// Label para mostrar o resultado do IMC
	Label etiquetaResultado = new Label();

	// Botão para calcular o IMC
	Button botaoCalcular = new Button("Calcular IMC");
	botaoCalcular.setOnAction(e -> {
		double peso = Double.parseDouble(campoPeso.getText());
		double altura = Double.parseDouble(campoAltura.getText());

		double imc = peso / (altura * altura);
		etiquetaResultado.setText(String.format("Seu IMC é: %.2f,", imc));
	});
	}
}
