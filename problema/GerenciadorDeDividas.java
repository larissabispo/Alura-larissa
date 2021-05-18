package problemas;
public class GerenciadorDeDividas {
	public void efetuaPagamento(Divida divida, double valor) {
		Pagamento pagamento = new Pagamento();
        pagamento.setCnpjPagador(cnpjPagador);
        pagamento.setPagador(nomePagador);
        pagamento.setValor(valor);
        divida.paga(valor);
        divida.getPagamentos().add(pagamento);
      }
	
	
}
