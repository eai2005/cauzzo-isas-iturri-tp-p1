package juego;

import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class Zombie {
	double x,y,escala,velocidadX;
	Entorno e;
	Image Img;
	double vida;
	boolean estaMuerto;
	
	public Zombie(double x, double y, Entorno e) {
		this.x=x;
		this.y=y;
		this.escala=0.75;
		this.e=e;
		this.velocidadX=1; //0.8
		this.Img=Herramientas.cargarImagen("Imagenes/ZombiePVZ.gif");
		// Vida y un booleano para verificar si esta muerto el zombie
		this.vida=5;
		this.estaMuerto=false;
		
	}
	public void dibujar (Entorno e){
		e.dibujarImagen(Img, this.x, this.y, 0, escala);
	}
	public void mover() {
		x-=velocidadX;
	}
	public void vida(int d) {
		this.vida-=d;
	}
	public boolean estaMuerto() {
		this.estaMuerto=true;
		return true;
		}
	
}
