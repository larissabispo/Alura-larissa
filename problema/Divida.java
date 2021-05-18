package problemas;

import java.util.ArrayList;

public class Divida {
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;
	private Cnpj cnpjCredor = new Cnpj();


	public ArrayList<Pagamento> getPagamentos() {
		return this.pagamentos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValorPago() {
		return valorPago;
	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void Paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor inválido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;

	}
    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
          if (pagamento.getData().before(data)) {
            pagamentosFiltrados.add(pagamento);
          }
        }
        return pagamentosFiltrados;
      }
      public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
          if (pagamento.getValor() > valorMinimo) {
            pagamentosFiltrados.add(pagamento);
          }
        }
        return pagamentosFiltrados;
      }
      public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
          if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
            pagamentosFiltrados.add(pagamento);
          }
        }
        return pagamentosFiltrados;
      }
    
      public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        paga(pagamento.getValor());
      }
     
   
      public void setTotal(double total) {
        this.total = total;
      }
      public double valorAPagar() {
        return this.total - this.valorPago;
      }
    }
	
}
