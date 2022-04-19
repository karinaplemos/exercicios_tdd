package boleto;

import java.util.Date;

public class Boleto {

	private int codigo;
	private double valorPago;
	private Date data;
	
	public Boleto(int cod, double valor, Date data) {
		this.codigo = cod;
		this.valorPago = valor;
		this.data = data;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
