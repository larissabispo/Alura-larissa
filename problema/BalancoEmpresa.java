package problemas;

import java.util.HashMap;

public class BalancoEmpresa {
	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

	public void cadastroDivida(String credor, String cnpjCredor, double valor) {
		Divida divida = new Divida();
		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		dividas.put(cnpjCredor, divida);

	}

	public void pagaDividaas(String cnpjCredor, double valor, String nomePagador, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.Paga(valor);
			divida.registra(pagamento);
		}
	}
}
