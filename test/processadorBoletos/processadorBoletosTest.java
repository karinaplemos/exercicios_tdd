package processadorBoletos;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;

class processadorBoletosTest {
	
	@DisplayName("Teste para um boleto")
	@Test
	public void testPagamento() {
		Fatura fatura = new Fatura("Karina Lemos", 122.00, new Date());
		Boleto boleto = new Boleto(102, 122.00, new Date());
		ProcessadorBoletos pb = new ProcessadorBoletos();
		assertEquals(true, pb.efetuaPagamento(boleto,fatura));
	}

}

