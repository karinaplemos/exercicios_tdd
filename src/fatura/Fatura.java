package fatura;

import java.util.Date;

public class Fatura {

	private String nomeCliente;
	private double valorTotal;
	private Date data;
	public boolean estadoPago;
	
	
	
	public Fatura(String nome, double valor, Date data) {
		this.nomeCliente = nome;
		this.valorTotal = valor;
		this.data = data;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setDataFatura(Date data) {
		this.data = data;
	}
	
	public boolean getEstadoPago(){
		return estadoPago;
	}
	
	public void setEstadoPago(boolean estadoPago){
		this.estadoPago = estadoPago;
	}
	
	
}
