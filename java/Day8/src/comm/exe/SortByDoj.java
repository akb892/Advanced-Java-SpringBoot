package comm.exe;


import java.util.Comparator;

public class SortByDoj implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
//		Period p = Period.between(o1.getDoj(), o2.getDoj());
//		return p.getYears();
		
		return o1.getDoj().compareTo(o2.getDoj());
	}

}
