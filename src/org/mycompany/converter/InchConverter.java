package org.mycompany.converter;

public class InchConverter {
	private int _inch;
	public InchConverter(int inch){
		this._inch = inch;
	}
	
	public double toFeet(){
		return (double) _inch / 12;
	}
}
