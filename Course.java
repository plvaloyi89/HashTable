import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.sound.sampled.Line;


public class Course implements Map {
	
	Random rand;
	Hashtable<String, Integer> data=new Hashtable<>();
	File file=new File("exam3input.dat");
	
	
	public void Files() throws FileNotFoundException{
		String line = null;
			Scanner scan= new Scanner(file);
			while(scan.hasNextLine()){
				 line=scan.nextLine();	
				
				 data.put("\n"+line , hashCode());
				 data.containsKey(hashCode());
				 System.out.print(data);
			}
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 * This hash function is just a simple one that takes the size oof the array and multiplies that by 37
	 * and then having a mod of 1000
	 */
	@Override
	public int hashCode() {
		int result=0;
		result= 37 * data.size();
		result=result * 107;	
		
		return result %1000;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Course other = (Course) obj;
		if (file == null) {
			if (other.file != null) {
				return false;
			}
		} else if (!file.equals(other.file)) {
			return false;
		}
		return true;
	}


	@Override
	public void clear() {
		data.clear();
		
	}


	@Override
	public boolean containsKey(Object key) {
		if(data.keys() != null){
			return false;
		}else{
		System.out.print(data.contains(key));
		}
		return false;
		
	}


	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isEmpty() {
		if(data.isEmpty()){
			return true;
		}
		return false;
	}


	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

public void table(){
	System.out.print(data);
}



	
}
