package entities;

public abstract class Estudante {
	
    private int matricula;
    private String cpf;
    private double pontos;
    private boolean status;

    //Contrutor
    public Estudante(String cpf, int matricula) {
        super();
        this.cpf = cpf;
        this.matricula = matricula;
    }

    //Métodos
    public void adicionarPontos(double pontos) {
        this.pontos += pontos;
    }

    public void tirarPontos(int pontos) {

        if (pontos <= this.pontos) {
            this.pontos -=  pontos;
        }

        else if (pontos > this.pontos) {
            System.out.println("\nImpossível retirar nota...");
        }

    }

    //Encapsulamento - getters and setters
    public int getMatricula() {
        return matricula;
    }
   
    private void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCpf() {
        return cpf;
    }
  
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public double getPontos() {
        return pontos;
    }
  
    private void setPontos(double pontos) {
        this.pontos = pontos;
    }
    
}