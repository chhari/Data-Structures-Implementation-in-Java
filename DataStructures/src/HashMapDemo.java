
public class HashMapDemo {

	public HashMapDemo() {
	
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
	
		HashTableArray<String> hm= new HashTableArray<String>(10);
		hm.put(11, "yo");
		hm.put(12, "yo1");
		hm.put(13, "yo2");
		hm.put(14, "yo3");
		System.out.println(hm.get(13));
	}

}
