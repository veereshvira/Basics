package customSorting;

import java.util.Comparator;

public class Sortbyid implements Comparator<Employee>{
@Override
public int compare(Employee x,Employee y) {
	return x.id -y.id;
}
}
