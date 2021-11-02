package reto5;

//1. Modelo
//2. Interface
//3. Repositorio
//4. Servicios
//5. Controlador o Web

// Categoria, Game ,Cliente,Mensaje y Reservacion

// @author juanc



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"Reto5.Modelo"})
public class Reto5Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto5Application.class, args);
	}

}
