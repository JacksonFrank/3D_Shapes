
public class TriangularPrism implements Interface3D{
	private float s1, s2, s3, length;
	
	 public TriangularPrism(float s1, float s2, float s3, float length) {
		 this.s1 = s1;
		 this.s2 = s2;
		 this.s3 = s3;
		 this.length = length;
	 }
	 
	 public float getVolume() {
		float s = ((s1 + s2 + s3) / 2);
		return (float)(length * Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)));
	 }
	 public float getSA() {
		 float s = ((s1 + s2 + s3) / 2f);
		 float ends = (float)(2 * (Math.sqrt(s * (s - s1) * (s - s2) * (s - s3))));
		 float body = (s1 * length) + (s2 * length) + (s3 * length);
		 return body + ends;
	 }
}
