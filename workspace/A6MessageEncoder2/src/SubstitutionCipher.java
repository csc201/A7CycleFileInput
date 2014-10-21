
public class SubstitutionCipher implements MessageEncoder {
	private int shift;
	public SubstitutionCipher(int shift) {
		this.shift = shift;
	}
	@Override
	public String encode(String plainText) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private char shifter(char letter) {
		return ((char)(letter+this.shift));
	}

}
