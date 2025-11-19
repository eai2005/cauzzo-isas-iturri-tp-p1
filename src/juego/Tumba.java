package juego;

import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class Tumba {
	double x,y,escala,vida;
	Entorno e;
	Image Img;
	boolean destruida;
	public Tumba(double x, double y, Entorno e) {
		this.x=x;
		this.y=y;
		this.e=e;
		this.Img=Herramientas.cargarImagen("Imagenes/TumbaB.png");
		this.escala=0.17;
		this.vida=2;
	}
	public void dibujar() {
		e.dibujarImagen(this.Img,this.x, this.y, 0, this.escala);
	}
	//vida de la tumba
	public void recibirDisparo(){
		this.vida--;
	}
	//boleano si esta destruida
	public boolean estaDestruida() {
		if(this.vida<=0) {
			return true;
		}
		return false;
	}
}
