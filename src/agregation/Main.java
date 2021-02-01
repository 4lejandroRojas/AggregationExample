package agregation;

public class Main {

	public static void main(String[] args) {
		Address addressMaria = new Address("Piedras Negras", "Coahuila", "Mexico", "Av. Revolución #2, Las casas, Piedras Negras, Coahuila, México");
		Employee maria = new Employee(1L, "María de los Ángeles", "García", addressMaria);
		
		Address addressAlejandro = new Address("Vancouver", "Columbia", "Canada", "The mountain #2, Distric commercial, Vancouver, Columbia, Canada");
		Employee alejandro = new Employee(2L, "Alejandro", "Rojas", addressAlejandro);
		
		Address addressOffice = new Address("CDMX", "CDMX", "México", "Av. Reforma #133, Col. Las danzarinas, CDMX, México");
		Office office = new Office(alejandro, addressOffice);
		
		System.out.printf("# Employee: %d, with name %s %s \n And direction: %s \n", maria.getId(), maria.getFirstName(),
				maria.getLastName(), maria.getAddress().getFormattedAddress());
		System.out.printf("Foreign office in: %s \n And boss %s %s but localized in %s \n", office.getAddress().getFormattedAddress(),
				office.getBoss().getFirstName(), office.getBoss().getLastName(), office.getBoss().getAddress().getFormattedAddress());
	}
	
	/**
	 *  Output
	 * # Employee: 1, with name María de los Ángeles García 
 	 * And direction: Av. Revolución #2, Las casas, Piedras Negras, Coahuila, México 
	 * Foreign office in: Av. Reforma #133, Col. Las danzarinas, CDMX, México 
 	 * And boss Alejandro Rojas but localized in The mountain #2, Distric commercial, Vancouver, Columbia, Canada 
	 * 
	 */

}
