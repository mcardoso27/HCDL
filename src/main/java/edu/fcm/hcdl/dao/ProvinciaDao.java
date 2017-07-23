
package edu.fcm.hcdl.dao;

import edu.fcm.hcdl.model.Provincia;
import java.util.List;

public interface ProvinciaDao {
    
    public List<Provincia> getAll();
    
    public void createProvincia (Provincia p);
    
    public void editProvincia (Provincia p);
    
    public void removeProvincia (int id);
    
    public Provincia getProvincia (int id);
    
}
