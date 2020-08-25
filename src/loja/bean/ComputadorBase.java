package loja.bean;

public abstract class ComputadorBase extends ClasseBase {

	private String marca;
	private float preco;
	private int quantidade;
	private String tipoHD; 
	private String marcaHD; 
	private String  marcaFonte ;
	private int potenciaFonte; 
	private String tipoFonte; 
	private int capacidadeHD; 
	private String tipoMemoria; 
	private String marcaMemoria;
	
	public ComputadorBase(String marca,float preco,int quantidade) {
		super();
		this.marca=marca;
		this.preco=preco;
		this.quantidade=quantidade;
	}
	
	public ComputadorBase(String marca,float preco,int quantidade,String tipoHD,String marcaHD,String  marcaFonte,int potenciaFonte,String tipoFonte,int capacidadeHD,String tipoMemoria,String marcaMemoria) {
		super();
		this.marca=marca;
		this.preco=preco;
		this.quantidade=quantidade;
		this.tipoHD=tipoHD;
		this.marcaHD=marcaHD;
		this.marcaFonte =marcaFonte ;
		this.potenciaFonte=potenciaFonte;
		this.tipoFonte=tipoFonte;
		this.capacidadeHD=capacidadeHD;
		this.tipoMemoria=tipoMemoria;
		this.marcaMemoria=marcaMemoria;
	}
	
	@Override
	public  void print() {
		super.print();
		System.out.println("Marca: "+marca);
		System.out.println("Preço: "+preco);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("TipoHD: "+tipoHD);
		System.out.println("MarcaHD: "+marcaHD);
		System.out.println("MarcaFonte: "+marcaFonte) ;
		System.out.println("PotenciaFonte: "+potenciaFonte);
		System.out.println("TipoFonte: "+tipoFonte);
		System.out.println("CapacidadeHD: "+capacidadeHD);
		System.out.println("TipoMemoria: "+tipoMemoria);
		System.out.println("MarcaMemoria: "+marcaMemoria);
	}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getTipoHD() {
		return tipoHD;
	}


	public void setTipoHD(String tipoHD) {
		this.tipoHD = tipoHD;
	}


	public String getMarcaHD() {
		return marcaHD;
	}


	public void setMarcaHD(String marcaHD) {
		this.marcaHD = marcaHD;
	}


	public String getMarcaFonte() {
		return marcaFonte;
	}


	public void setMarcaFonte(String marcaFonte) {
		this.marcaFonte = marcaFonte;
	}


	public int getPotenciaFonte() {
		return potenciaFonte;
	}


	public void setPotenciaFonte(int potenciaFonte) {
		this.potenciaFonte = potenciaFonte;
	}


	public String getTipoFonte() {
		return tipoFonte;
	}


	public void setTipoFonte(String tipoFonte) {
		this.tipoFonte = tipoFonte;
	}


	public int getCapacidadeHD() {
		return capacidadeHD;
	}


	public void setCapacidadeHD(int capacidadeHD) {
		this.capacidadeHD = capacidadeHD;
	}


	public String getTipoMemoria() {
		return tipoMemoria;
	}


	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}


	public String getMarcaMemoria() {
		return marcaMemoria;
	}


	public void setMarcaMemoria(String marcaMemoria) {
		this.marcaMemoria = marcaMemoria;
	}
}
