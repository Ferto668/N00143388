package pe.edu.delfines.service;



import java.util.List;

import pe.edu.delfines.models.entity.Vendedor;


public interface VendedorService 
	extends CrudService<Vendedor, String>{
	List<Vendedor> fetchMayorSueldo(Float sueldo) throws Exception;
	
	
}
