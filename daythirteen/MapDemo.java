package daythirteen;
import java.util.*;
public class MapDemo {
	public static void main(String [] args)
	{
		/*Map<String,String>  m=new HashMap<String,String>();
		m.put("a", "ajith");
		m.put("r", "raj");
		m.put("s","selva");
		System.out.print(m);
		*/
		Map<Emp,String> map=new TreeMap<Emp,String>((o1,o2)->{return o1.compareTo(o2);});
		map.put(new Emp(1), "ajith");
		map.put(new Emp(2), "raj");
		map.put(new Emp(3), "dar");
		map.put(new Emp(4), "vimal");
		
		System.out.print(map);
		
		Set<Map.Entry<Emp, String>> s=map.entrySet();
		Iterator<Map.Entry<Emp, String>> i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<Emp, String> me=i.next();
			System.out.print(me.getKey()+" "+me.getValue());
		}
	}}
class Emp implements Comparable<Emp>
{
	Integer eid;
	public Emp(Integer e) {
		this.eid=e;
	}
	@Override
	public int compareTo(Emp o) {
		return eid.compareTo(o.eid);
	}
	public String toString(){
		return this.eid+" ";
	}
	
}