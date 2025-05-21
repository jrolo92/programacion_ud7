package ejemplos;

import java.io.Serializable;

public class ObjetoSerializable implements Serializable{
//	La L es de Long
	private static final long serialVersionUID = 1L;

	private int atributo1; // Es primitivo, por tanto serializable
	private static int atributo2; // Es estático, por tanto no se serializa
	private transient int atributo3; // Es transient, por tanto no se serializa
	
	
	public ObjetoSerializable(int atributo1, int atributo2, int atributo3) {
		super();
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
	}


	public int getAtributo1() {
		return atributo1;
	}


	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}


	public static int getAtributo2() {
		return atributo2;
	}


	public static void setAtributo2(int atributo2) {
		ObjetoSerializable.atributo2 = atributo2;
	}


	public int getAtributo3() {
		return atributo3;
	}


	public void setAtributo3(int atributo3) {
		this.atributo3 = atributo3;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
