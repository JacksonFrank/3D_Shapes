
public class Sphere implements Interface3D{
	private float radius;
	
	public Sphere(float radius) {
		this.radius = radius;
	}
	
	public float getVolume() {
		return (float)((4 / 3) * Math.PI * radius * radius * radius);
	}
	public float getSA() {
		return (float)(4 * Math.PI * radius * radius);
	}
}
