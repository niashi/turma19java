package entities;

public class Basico extends Estudante {

	private int diaAniversario;

	public Basico(String cpf, int matricula, int diaAniversario) {
		super(cpf, matricula);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void bonusAniversario(int diaAtual) {
		if (diaAniversario == diaAtual) {
			super.adicionarPontos(super.getPontos() * 0.1);
			System.out.println();
		}
	}
}
