package com.unaempresa.primerproyecto.model;

public class Image {
	private String path;
	private String capitalName;
	
	public Image(String path, String capitalName) {
		this.path = path;
		this.capitalName = capitalName;
	}

	public String getPath() { return path; }
	public String getCapitalName() { return capitalName; }

}
