package loja.bean;

public class Servidor extends ComputadorBase {

	private int slotsMemoria;
	private int capacidadeMemoria; 
	private int numeroHD; 
	private String tipoGabinete; 
	private String marcaGabinete; 
	
	public Servidor(String marca,float preco,int quantidade) {
		super(marca, preco, quantidade);
	}

	public Servidor(String marca, float preco, int quantidade, String tipoHD, String marcaHD, String marcaFonte,
			int potenciaFonte, String tipoFonte, int capacidadeHD, String tipoMemoria, String marcaMemoria,
			int slotsMemoria,int capacidadeMemoria,int numeroHD,String tipoGabinete,String marcaGabinete) {
		super(marca, preco, quantidade, tipoHD, marcaHD, marcaFonte, potenciaFonte, tipoFonte, capacidadeHD, tipoMemoria,
				marcaMemoria);
		this.slotsMemoria=slotsMemoria;
		this.capacidadeMemoria=capacidadeMemoria;
		this.numeroHD=numeroHD;
		this.tipoGabinete=tipoGabinete;
		this.marcaGabinete=marcaGabinete;
	}
	
	@Override
	public  void print() {
		super.print();
		System.out.println("slotsMemoria: "+slotsMemoria);
		System.out.println("capacidadeMemoria: "+capacidadeMemoria); 
		System.out.println("numeroHD: "+numeroHD); 
		System.out.println("tipoGabinete: "+tipoGabinete); 
		System.out.println("marcaGabinete: "+marcaGabinete); 
	}
	
	public int getSlotsMemoria() {
		return slotsMemoria;
	}

	public void setSlotsMemoria(int slotsMemoria) {
		this.slotsMemoria = slotsMemoria;
	}

	public int getCapacidadeMemoria() {
		return capacidadeMemoria;
	}

	public void setCapacidadeMemoria(int capacidadeMemoria) {
		this.capacidadeMemoria = capacidadeMemoria;
	}

	public int getNumeroHD() {
		return numeroHD;
	}

	public void setNumeroHD(int numeroHD) {
		this.numeroHD = numeroHD;
	}

	public String getTipoGabinete() {
		return tipoGabinete;
	}

	public void setTipoGabinete(String tipoGabinete) {
		this.tipoGabinete = tipoGabinete;
	}

	public String getMarcaGabinete() {
		return marcaGabinete;
	}

	public void setMarcaGabinete(String marcaGabinete) {
		this.marcaGabinete = marcaGabinete;
	}
}
