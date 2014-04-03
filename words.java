import java.util.Hashtable;
import java.util.*;

public class words{
	public static void main(String[] args){
		String a = "aab";
		Hashtable<Character, Integer> b = fx(a);
		System.out.println(b);
	}

	public static Hashtable<Character, Integer> fx(String a){
		//create a hashtable
		Hashtable<Character, Integer> data = new Hashtable<Character, Integer>();
		
		//populates the hashtable with (key, value)=(character, repetition time)
		for(int i=0; i<a.length(); i++){
			if(data.get(a.charAt(i)) != null){
				data.put(a.charAt(i), data.get(a.charAt(i))+1);
			}
			else{
				data.put(a.charAt(i), 1);
			}
		}
		
		//Gets all the keys of the hashtable
		Set keys = data.keySet();
		
		//iterate through the hashatble and remove the elements have value<=1
		for(Iterator i = keys.iterator(); i.hasNext();)
		{
			//char temp =(Character) i.next();
			if(data.get(i.next()) <= 1){
				i.remove();
			}
		}
		
		//returns the hashatble
		return data;
	}
}
