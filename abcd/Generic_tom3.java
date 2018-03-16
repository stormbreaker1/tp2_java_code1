package abcd;

class Generic_tom3{
	  public static void main(String[] args) {
	    Generic_jerry3<String,String,Integer> object1 = new Generic_jerry3<String,String,Integer>("meliodas","elizabeth",24000);

	    System.out.printf("%s and %s are amazing and have combined power of %d",object1.getT(),object1.getS(),object1.getU());
	  }
	}