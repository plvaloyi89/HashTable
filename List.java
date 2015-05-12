import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class List implements Map{
	
	ArrayList<String> data=new ArrayList<String>();
	Hashtable<String, Integer> Hdata=new Hashtable<>();
	
	File file=new File("exam3input.dat");
	
	public void Files() throws FileNotFoundException{
		String line;
		String sline = 0;
			Scanner scan= new Scanner(file);
			while(scan.hasNextLine()){
				 line=scan.nextLine();	
				sline=line;
				sline=data.add(line)
				Hdata.put(sline,76);
			
			}
		//	System.out.print(data);
			
			
			
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(data.isEmpty()){
			System.out.println(Hdata.size());
		}
		return false;
		
		
			}


	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		Hdata.size();
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}
}