package br.com.byaarts.beans;

import java.io.Serializable;

public class ImagemDestaque implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String description;
	private String link;
	private String urlimg;
	private int usable;
	
	
	
	
	public ImagemDestaque(int id, String name, String description, String link, String urlimg, int usable) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.link = link;
		this.urlimg = urlimg;
		this.usable = usable;
	}
	
	public ImagemDestaque() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUsable() {
		return usable;
	}
	public void setUsable(int usable) {
		this.usable = usable;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getUrlimg() {
		return urlimg;
	}
	public void setUrlimg(String urlimg) {
		this.urlimg = urlimg;
	}


}
