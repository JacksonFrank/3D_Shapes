/*
 Jackson Frank
 File: Cone.java
 Purpose: To return volume and SA of a cone base on a cylinder
 */
public class Cone extends Cylinder{
	private float BRadius, height;
	
	public Cone(float BRadius, float height) {
		super(BRadius, height);
		this.BRadius = BRadius;
		this.height = height;
	}
	
	public float getVolume() {
		return (super.getVolume() / 3);
	}
	public float getSA() {
		return (float)((Math.PI * BRadius * height) + (Math.PI * BRadius * (Math.sqrt((BRadius * BRadius) + (height * height)))));
	}
	
	
}
