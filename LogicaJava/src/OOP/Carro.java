package OOP;

public class Carro {
	private String marca;
	private String placa;
	private String cor;
	//private double tamanho;
	//private boolean ligado;

	//Nesse caso ele est� executando a tarefa de atribuir
	//Constructor s�o executores, quem criar o obejto � o new pega a vis�o
	public Carro(String marca, String placa,String cor) {
			this.marca = marca;
			this.placa = placa;
			this.cor = cor;
	
	}
	public String getDescricaoCarro(){
		
		String descricao = marca + " " + placa + " " + cor;
		return descricao;
	}
	
	
	

}
