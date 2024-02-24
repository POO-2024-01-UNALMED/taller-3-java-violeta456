package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		this.canal=1;
		this.volumen=1;
		this.precio=500;
	
	}
	
	//get y set atributos
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal=canal;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control control){
		this.control=control;
	}
	
	
	//Métodos de clase
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int tv) {
		numTV=tv;
	}
	public static int ContadorTVs() {
		numTV=numTV++;
		return numTV;
	}
	
	
	//TurnON y TurnOff
	
	public void turnOn(){
		estado= true;
	}
	public void turnOff() {
		estado=false;
	}
	public boolean getEstado() {
		return estado;	
	}
	
	//canalUP - canalDown y volumenUp - volumenDown
	
	public void canalUp() {
		if(canal<120 && estado==true) {
			canal++;		
		}
		
	}
	public void canalDown() {
		if (canal>1 && estado==true) {
			canal--;
		}
		
	}
	public void volumenUp() {
		if(volumen<7 && estado==true) {
			volumen++;
		}
		
	}
	public void volumenDown() {
		if(volumen>0 && estado==true) {
			volumen--;
		}
		
	}

}
