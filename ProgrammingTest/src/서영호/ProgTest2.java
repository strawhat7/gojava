package ¼­¿µÈ£;

import java.util.*;

public class ProgTest2 {
 	
	Map<String, MemberData> mapList = new Hashtable<>();
	
	void mapListAdd(String memberID, String name, String tel, String gender) {
		MemberData md = new MemberData(memberID, name, tel, gender);
			mapList.put(memberID, md);
		}
	
	void mapListRemove(String memberID, String name, String tel, String gender) {
		MemberData md = new MemberData(memberID, name, tel, gender);
		mapList.remove(memberID, md);
		}
	
	ArrayList<MemberData> getMapList() {
		Set<String> keyset = mapList.keySet();
		Iterator<String> keyiterator = keyset.iterator();
		ArrayList al = new ArrayList<MemberData>();
		
		while(keyiterator.hasNext()) {
			String memberID = keyiterator.next();
			MemberData name = mapList.get(memberID);
			MemberData tel = mapList.get(name);
			MemberData gender = mapList.get(tel);
			System.out.println(memberID+ "\t" + name+ "\t" + tel + "\t" + gender);
		}
		return al;
	}
}
