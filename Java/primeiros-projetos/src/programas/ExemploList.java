package programas;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		
		List<User> users= new ArrayList<>();
		
		int i = 0;
				
		while (i < 10) {
			User actual = new User("Nome " + i, "Sobrenome " + i);
			users.add(actual);
			System.out.println(users.get(i).getFirstName());
			i++;
		}
	}
}
