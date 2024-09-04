package pomponiosimone.unita_5_giorno_1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
class Unita5Giorno1ApplicationTests {

	@BeforeEach
	void setUp() {
		System.out.println("Inizio test classi principali");
	}

	@Test
	void contextLoads() {
	}

	@Autowired
	private MenuConfig menuConfig;
	@Test
	public void testCostoDelCoperto() {
System.out.println("TEST UNO");
		double expectedCostoDelCoperto = 2.50;

		double actualCostoDelCoperto = menuConfig.getCostoDelCoperto();
		System.out.println("Costo del coperto: " + actualCostoDelCoperto);
		assertEquals(expectedCostoDelCoperto, actualCostoDelCoperto, "Il costo del coperto dovrebbe essere 2.50");
	}

@Test
	public void costoMargherita() {
	System.out.println("TEST DUE");
		double expectedCostoMargherita = 6.50;
		double actualCostoMargherita = menuConfig.getCostoMargherita();
		System.out.println("Costo della margherità è giusto: " + actualCostoMargherita );
		assertEquals(expectedCostoMargherita,actualCostoMargherita,"il costo della margherità dovrebbe essere 6.50");
}


}

