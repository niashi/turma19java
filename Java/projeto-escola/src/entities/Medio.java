package entities;

public class Medio extends Estudante {
	
	private int contadorBoletim;

	public Medio(String cpf, int matricula) {
		super(cpf, matricula);
		this.contadorBoletim = contadorBoletim;
	}

	public int getContadorBoletim() {
		return contadorBoletim;
	}

	private void setContadorBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
	
	public void imprimirBoletim() {
		System.out.println("Boletim:");
		System.out.printf("Pontos atuais: %s" , super.getPontos());
		
	}
	
}
