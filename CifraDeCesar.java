package stringreferencia;

public class CifraDeCesar {

	public char[] alfabeto;
	private char[] chave;
	public String palavra;

	public CifraDeCesar() {
		this.alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		setChave("DEFGHIJKLMNOPQRSTUVWXYZABC".toCharArray());
	}

	private void setChave(char[] chave) {
		this.chave = chave;
	}

	public String cifrar(String palavra) {
		String cifrado = "";
		char[] palavraQuebrada = palavra.toCharArray();

		for (int i = 0; i < palavraQuebrada.length; i++) {
			String valor = String.valueOf(palavraQuebrada[i]);
			if (" ".equalsIgnoreCase(valor)) {
				cifrado += " ";
			} else {
				int pos = encontrarChar(palavraQuebrada[i], alfabeto);
				cifrado += chave[pos];
			}

		}

		return cifrado;
	}

	public String decifrar(String palavra) {
		String decifrado = "";
		char[] palavraQuebrada = palavra.toCharArray();

		for (int i = 0; i < palavraQuebrada.length; i++) {
			String valor = String.valueOf(palavraQuebrada[i]);
			if (" ".equalsIgnoreCase(valor)) {
				decifrado += " ";
			} else {
				int pos = encontrarChar(palavraQuebrada[i], chave);
				decifrado += alfabeto[pos];
			}

		}


		return decifrado;
	}

	private int encontrarChar(char letra, char[] base) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] == letra) {
				return i;
			}
		}
		return -1;
	}

}
