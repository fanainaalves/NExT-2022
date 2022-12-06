package next.projetoreferencia.repositorios.reuso;

import next.projetoreferencia.utilidades.Identificavel;

public class RepositorioIdentificavelTipoParametrizado<T extends Identificavel> {
	private Identificavel[] listaIdentificaveis = new Identificavel[100];
	private int tamanhoAtual = -1;
	public void incluir(T ident) {
		tamanhoAtual++;
		listaIdentificaveis[tamanhoAtual] = ident;		
	}
	public T buscar(long identificador) {
		for (Identificavel ident : listaIdentificaveis) {
			if (ident != null && ident.getIdentificador() == identificador) {
				return (T)ident;
			}
		}
		return null;
	}
	public T[] consultarTodos() {
		Identificavel[] listaRetorno = new Identificavel[tamanhoAtual + 1];		
		for (int i=0; i<listaRetorno.length; i++) {
			listaRetorno[i] = listaIdentificaveis[i];
		}
		return (T[])listaRetorno;
	}
}
