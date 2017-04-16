package LACola;

import java.util.Arrays;

public class Cola<t> {
private t[] objeto;

public Cola(t[] objeto) {
	this.objeto = objeto;
}
public Cola(int Capacidad){
	
}
public void push(t objeto) {	
	this.objeto = Arrays.copyOf(this.objeto,this.objeto.length + 1);
	this.objeto[this.objeto.length-1] = objeto;
}
public void remove(t objeto){
	this.objeto=null;
	this.objeto=Arrays.copyOf(this.objeto,this.objeto.length-1);
}
public void pop(){
	this.objeto[0]=null;
	
	this.objeto=Arrays.copyOf(this.objeto,this.objeto.length - 1);
	
	}
public void clear(){
	for(int i=0;i<this.objeto.length;i++){
		this.objeto[i]=null;
	}
	this.objeto=Arrays.copyOf(this.objeto,this.objeto.length -this.objeto.length);
}
public boolean contains(t objeto){
	boolean contiene=false;
	for (t ob:this.objeto){
		if (ob==objeto){
			contiene=true;
		}
		else{
			contiene=false;
		}
	}	
	return contiene;	
}
public boolean isempty(){
	return this.objeto.length==0;
}
public int size(){
	return this.objeto.length;
}
}
