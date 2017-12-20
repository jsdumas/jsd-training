package io.jsd.training.designpattern.structural.proxy.treeptik.proxy;

import java.util.List;

public class FileDescription {

	private String nom;
	private String path;

	private List<String> lines;

	public FileDescription(String name, String path) {
		nom = name;
		lines = new ProxyList(path);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<String> getLines() {
		return lines;
	}

	public void setLines(List<String> lines) {
		this.lines = lines;
	}
}
