package day17;

import java.util.*;

public class Test09 {

	public Test09() {
		// HashMap
		// 찬구 이름은 키값으로 하고 전화번호를 데이터로 하는 맵을 만들어 사용해보자
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("큰손", "010-9999-9999");
		map.put("작은손", "010-3333-3333");
		map.put("진로", "010-5555-5555");
		map.put("늘보", "010-2222-2222");

		// 카값만 뽑아내자 keySet()
		Set<String> key = map.keySet();

		// ArrayList로 변환해서 출력해보자, Iterator로 변환해서 사용해도 된다.

		ArrayList<String> kList = new ArrayList<String>(key);

		System.out.println("------------------------------");
		for (String k : kList) {
			// 출력
			System.out.println(k + " : " + map.get(k));
		}
		System.out.println("------------------------------");
		System.out.println();
		// Map.Entry를 사용해서 키와 벨류룰 출력해보자
		Set<Map.Entry<String, String>> set = map.entrySet();

		// 이제 데이터는 모두 변환이 되었으니 꺼내서 출려해보자
		Iterator<Map.Entry<String, String>> itor = set.iterator();
		
		while(itor.hasNext()) {
			Map.Entry<String, String> ent = itor.next();
			String k = ent.getKey();
			String val = ent.getValue();
			//Map.Entry 타입으로 받으면 VO클래스로 받기 때문에 내부적으로 getters, setters가 되어있기 떄문에
			//값을 가져오기 위해서는 getter을 써야 한다.
			
			System.out.println(k + " : " + val);
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
