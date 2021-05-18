
public class Cnpj {
	private String valor;

	public boolean ehValido() {
		return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj() && segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
	}

	private int primeiroDigitoCorreto() {
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo cnpj
	}

	private int primeiroDigitoVerificador() {
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo cnpj
	}

	private int segundoDigitoCorreto() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
	}

	private int segundoDigitoVerificador() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
	}

	public String getCnpj() {
		return cnpjCredor;
	}

	public void setCnpj(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

}
