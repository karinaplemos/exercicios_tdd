package pagamento;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Date;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import boleto.Boleto;
import fatura.Fatura;

class pagamentoTest {
	
		private ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		
		@DisplayName("Teste para uma lista de boletos")
		@Test
		public void testPagamento() {
		Fatura fatura = new Fatura("Karina Lemos", 300.00, new Date());
		Boleto boleto1 = new Boleto(101, 100.00, new Date());
		Boleto boleto2 = new Boleto(102, 100.00, new Date());
		Boleto boleto3 = new Boleto(103, 100.00, new Date());
		
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		
		Pagamento pagamento = new Pagamento(fatura.getValorTotal(), new Date(), "Boleto");
		pagamento.efetuaPagamento(boletos, fatura, pagamento);
		
		assertEquals(true, fatura.estadoPago);
	}

}

      