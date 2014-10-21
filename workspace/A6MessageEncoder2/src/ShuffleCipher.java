public class ShuffleCipher implements MessageEncoder {
	private int numberOfShuffle;

	public ShuffleCipher(int numberOfShuffle) {
		this.numberOfShuffle = numberOfShuffle;
	}

	@Override
	public String encode(String plainText) {
		String cipherText = "";
		for (int i = this.numberOfShuffle; i > 0; i--)
			cipherText = singleShuffler(plainText);
		return cipherText;
	}

	public String singleShuffler(String message) {
		
		String newMessage;
		String temp;
		newMessage = message.replace(""," ");
		System.out.println(newMessage);
		System.out.println(newMessage.length());
		//change string to array
		String[] ary = newMessage.split("");
		for(String x: ary) {
			System.out.println(x);
		}
		
		//replacement
		//i+3 = start index for first half 
				//(newMessage.length()/2)+2 = start index of second half
				//loop count < message.length/2
				    //replace newMessage[i+2] = newMessage[(newMessage.length()/2)+2]
		//		
		for(int count=0; count < message.length()/2; count++) {
			ary[count+3] = ary[(ary.length/2)+count+2];
		}
		
		for(String x: ary) {
			System.out.println(x);
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i=1; i<(ary.length/2)+1; i++) {
			builder.append(ary[i]);
		}
		return builder.toString();
	}
	// afbgchdie
}


/*newMessage = message.toCharArray();
//newMessage = message.split("", -1);
for (int i = 0; i < (newMessage.length / 2); i++) {
	// insert between
	temp = newMessage[i + 1]; // temp = b
	newMessage[i + 1] = newMessage[(newMessage.length / 2) + 1]; // newMessage[2]=f
	// shift down
	for (int j = (newMessage.length / 2) + 1; j > (i + 1); j--)
		newMessage[j] = newMessage[j - 1];
}
StringBuilder builder = new StringBuilder();
for (String s : newMessage) {
	builder.append(s);
}
return builder.toString();
return new String(newMessage);
// length /2 ->4
// insert between and shift down
*/