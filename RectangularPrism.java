
public class RectangularPrism implements Interface3D {
	private float length, width, height;
	
	
	public RectangularPrism(float length, float width, float height){
		if(length < 0 || width < 0 || height < 0) {
			throw new IllegalArgumentException();
		}
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	
	public float getVolume(){
		return (length * width * height);
	}
	public float getSA(){
		return ((2f * length * width) + (2f * length * height) + (2f * width * height));
	}
}