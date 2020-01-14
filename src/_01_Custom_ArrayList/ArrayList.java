package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] cool;
	public ArrayList() {
		cool = (T[]) new Object [0];

	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return cool [loc];
	}
	
	public void add(T val) {
		T[] cool1 = (T[]) new Object [cool.length + 1];
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] cool2 = (T[]) new Object [cool.length - 1];
	}
	
	public boolean contains(T val) {
		
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
	
		return 0;
	}
}