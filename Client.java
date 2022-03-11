packpackage com.cg.placementmgmt.client;

import java.time.LocalDate;

public class Client{
	public static void main(String[] args){
	IPlacementService service = new IPlacementServiceImpl();
	Placement placement = new placement();

	placement.setId(3);
	placement.setName("Kruthika");
	placement.setCollege("AIT");
	placement.setQualification("BE");
	placement.setDate(LocalDate.now());
	placement.setYear(2022);
	placement.addPlacement(placement);
	}
}
	