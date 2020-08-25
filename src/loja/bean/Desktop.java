package loja.bean;

public class Desktop extends ComputadorVideo {
	private int placasVideo; 
	private String marcaPlacaVideo;
	
	public Desktop(String marca,float preco,int quantidade) {
		super(marca, preco, quantidade);
	}
	
	public Desktop(String marca, float preco, int quantidade, String tipoHD, String marcaHD, String marcaFonte,
			int potenciaFonte, String tipoFonte, int capacidadeHD, String tipoMemoria, String marcaMemoria,
			int capacidadeMemoria, int numeroHD, String tipoGabinete, String marcaGabinete,int placasVideo,String marcaPlacaVideo) {
		super(marca, preco, quantidade, tipoHD, marcaHD, marcaFonte, potenciaFonte, tipoFonte, capacidadeHD, tipoMemoria,
				marcaMemoria, capacidadeMemoria, numeroHD, tipoGabinete, marcaGabinete);
		this.placasVideo=placasVideo;
		this.marcaPlacaVideo=marcaPlacaVideo;
	}
	
	@Override
	public  void print() {
		super.print();
		System.out.println("placasVideo:"+placasVideo);
		System.out.println("marcaPlacaVideo:"+marcaPlacaVideo);
	}
	
	public int getPlacasVideo() {
		return placasVideo;
	}
	public void setPlacasVideo(int placasVideo) {
		this.placasVideo = placasVideo;
	}
	public String getMarcaPlacaVideo() {
		return marcaPlacaVideo;
	}
	public void setMarcaPlacaVideo(String marcaPlacaVideo) {
		this.marcaPlacaVideo = marcaPlacaVideo;
	} 
}
