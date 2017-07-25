
package edu.fcm.hcdl.dao;

import edu.fcm.hcdl.model.Provincia;
import java.util.List;

public interface ProvinciaDao {
    
    public List<Provincia> getAll();
    
    public void saveProvincia (Provincia p);
    
    public void deleteById (int id);
    
    public Provincia findProvinciaById (int id);
    
    public Provincia findProvinciaByName (String id);
    
}
