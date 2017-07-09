
package edu.fcm.hcdl.dao;

import edu.fcm.hcdl.model.Provincias;
import java.util.List;

public interface ProvinciaDao {
    
    public List<Provincias> getAll();
    
    public void createProvincia (Provincias p);
    
    public void editProvincia (Provincias p);
    
    public void removeProvincia (int id);
    
    public Provincias getProvincia (int id);
    
}
