
public class MessageDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println((char)('a'+3));
		ShuffleCipher shuffler = new ShuffleCipher(1);
		System.out.println(shuffler.encode("abc"));
		//acb
	}

}
