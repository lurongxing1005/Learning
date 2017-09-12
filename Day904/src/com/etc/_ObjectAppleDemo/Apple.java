package com.etc._ObjectAppleDemo;

import java.io.Serializable;

public class Apple implements Serializable {
private double weight;
private String color;
private double size;
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
@Override
public String toString() {
	return "Apple [weight=" + weight + ", color=" + color + ", size=" + size
			+ "]";
}
public Apple(double weight, String color, double size) {
	super();
	this.weight = weight;
	this.color = color;
	this.size = size;
}
public Apple() {
	super();
	// TODO Auto-generated constructor stub
}
}
