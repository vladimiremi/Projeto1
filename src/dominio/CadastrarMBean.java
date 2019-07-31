package dominio;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import entidade.Pessoa;


@Named
@RequestScoped
public class CadastrarMBean {

	private Pessoa pes = new Pessoa();

	public Pessoa getPes() {
		return pes;
	}

	public void setPes(Pessoa pes) {
		this.pes = pes;
	}
	
	public String salvarDados(){
		System.out.println(pes.getNome());
		
		return "";
	}
	
}
