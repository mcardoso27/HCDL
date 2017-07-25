/*
 * Historia Clinica Digital Laboral
 * @author Martin Cardoso
 */
package edu.fcm.hcdl.service;

import edu.fcm.hcdl.dao.ProvinciaDao;
import edu.fcm.hcdl.model.Provincia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("provinciaService")
@Transactional
public class ProvinciaServiceImpl implements ProvinciaService{
    
    @Autowired
    private ProvinciaDao dao;
    
    @Override
    public List<Provincia> findAllProvincias() {
        return dao.getAll();
    }

    @Override
    public Provincia findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Provincia findByName(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveProvincia(Provincia p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateProvincia(Provincia p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProvinciaById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
