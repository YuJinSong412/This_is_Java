package Exercise11;

import java.util.Arrays;

class Yu implements Comparable<Yu>{
	String name;
	Yu(String name){
		this.name = name;
	}
	public int compareTo(Yu o) {
		return name.compareTo(o.name);
	}
}
public class Ex32 {

	public static void main(String[] args) {
		int [] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: "+index);
		
		String [] names = {"홍길동","송유진","최보규"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "송유진");
		System.out.println("찾은 인덱스: "+index);
		
		Yu m1 = new Yu("송유진");
		Yu m2 = new Yu("송수민");
		Yu m3 = new Yu("정혜정");
		Yu[] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: "+index);
		

	}

}
