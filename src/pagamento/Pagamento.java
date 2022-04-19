package pagamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import boleto.Boleto;
import fatura.Fatura;

public class Pagamento {

	private double valorPago;
	private Date dataPagamento;
	private String tipoPagamento;
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

	
	public Pagamento(double valor, Date data, String tipo) {
		this.valorPago = valor;
		this.dataPagamento = data;
		this.tipoPagamento = tipo;
	}

	public double getValorPago() {
		return valorPago;
	}
	
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	public Date getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	private double somaPagamentos;	 

		
	public void efetuaPagamento(ArrayList<Boleto> boletos, Fatura f, Pagamento pag) {
		for (Iterator<Boleto> i = boletos.iterator(); i.hasNext();) {
			Boleto bol = (Boleto) i.next();
			somaPagamentos += bol.getValorPago();
		}
			
		if (somaPagamentos == f.getValorTotal()) {
			pagamentos.add(pag);
			f.setEstadoPago(true);

		}else {
			f.setEstadoPago(false);

		}
					
	}
	
}
