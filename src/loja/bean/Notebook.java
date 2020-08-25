package loja.bean;

public class Notebook extends ComputadorVideo {
	private int slotsMemoria;
	
	public Notebook(String marca,float preco,int quantidade) {
		super(marca, preco, quantidade);
	}
	
	public Notebook(String marca, float preco, int quantidade, String tipoHD, String marcaHD, String marcaFonte,
			int potenciaFonte, String tipoFonte, int capacidadeHD, String tipoMemoria, String marcaMemoria,
			 int capacidadeMemoria, int numeroHD, String tipoGabinete, String marcaGabinete,int slotsMemoria) {
		super(marca, preco, quantidade, tipoHD, marcaHD, marcaFonte, potenciaFonte, tipoFonte, capacidadeHD, tipoMemoria,
				marcaMemoria, capacidadeMemoria, numeroHD, tipoGabinete, marcaGabinete);
		this.slotsMemoria=slotsMemoria;
	}
	
	@Override
	public  void print() {
		super.print();
		System.out.println("slotsMemoria:"+slotsMemoria);
	}


public int getSlotsMemoria() {
	return slotsMemoria;
}


public void setSlotsMemoria(int slotsMemoria) {
	this.slotsMemoria = slotsMemoria;
}

}
