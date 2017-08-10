
public class Entry {
	int key;
	Object value;
	Entry next;
	public Entry(int key,Object value) {
		this.key = key;
		this.value = value;
		next = null;
		// TODO Auto-generated constructor stub
	}
	public Entry(){
		next = null;
	}
	public int GetKey(){
		return key;
	}
	public Object GetValue(){
		return value;
	}

}
