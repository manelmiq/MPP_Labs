package SE4_Lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		return  list.stream().filter(s-> (s.getGpa() > 3.0 &&  s.getMajor().equals(Majors.CS) )).collect(Collectors.toList());
	}
}
