package org.mycompany.converter;

public class FeetConverter {
	private int _feet;
	public FeetConverter(int feet){
		this._feet = feet;
	}
	
	public int toInch(){
		return _feet * 12;
	}
}
