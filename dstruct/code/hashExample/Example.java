package hashExample;

import java.util.HashMap;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
		Map<String, Double> map  = new HashMap<String,Double>();
		map.put("a", 3.0);
		System.out.println(map.get("a"));
	}

}
