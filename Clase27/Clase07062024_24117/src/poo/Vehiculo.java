package poo;

public abstract class Vehiculo
{
	//atributos
	 private String marca;
	 private String modelo;
	 private int a�o;
	 private String color;
	 private double precio;
	 private int tanque;
	 private int cantCombustible;
	 
	 
	 	 
	 public String getMarca() 
	 {
		return marca;
	 }

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	public String getModelo() 
	{
		return modelo;
	}

	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}

	public int getA�o() 
	{
		return a�o;
	}

	public void setA�o(int a�o) 
	{
		this.a�o = a�o;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public double getPrecio() 
	{
		return precio;
	}

	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}

	//metodo contructor por defecto
	 public Vehiculo()
	 {
		 this.marca="Desconocida";
		 this.modelo="Desconocida";
		 this.a�o=0;
		 this.color="Desconocida";
		 this.precio=0;
	 }
	 
	 //metodos contructores
	 public Vehiculo(String marca,String modelo)
	 {
		 this.marca=marca;
		 this.modelo=modelo;
	 }
	 
	  


	public Vehiculo(String marca,String modelo,int a�o)
	 {
		 this.marca=marca;
		 this.modelo=modelo;
		 this.a�o=a�o;
	 }
	  
	 
	 //metodo
	 public void imprimir()
	 {
		 System.out.println("Marca: "+this.marca+" Modelo:"+this.modelo+" A�o:"+this.a�o);
	 }
	 
	 public String imprimir2()
	 {
		return "Marca: "+this.marca+" Modelo:"+this.modelo+" A�o:"+this.a�o;
	 }
	 
	 //acelerar --> consume 1 litro de nafta.
	 
	 //cargar nafta-->hasta la capacidad del tanque.
	 
	 
	 
	 
}


