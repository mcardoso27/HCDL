/*
 * Historia Clinica Digital Laboral
 * @author Martin Cardoso
 */
package edu.fcm.hcdl.service;

import edu.fcm.hcdl.model.Provincia;
import java.util.List;

public interface ProvinciaService {
    
    public List<Provincia> findAllProvincias();
    
}
