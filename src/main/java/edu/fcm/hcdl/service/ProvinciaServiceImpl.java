/*
 * Historia Clinica Digital Laboral
 * @author Martin Cardoso
 */
package edu.fcm.hcdl.service;

import edu.fcm.hcdl.dao.ProvinciaDao;
import edu.fcm.hcdl.model.Provincias;
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
    public List<Provincias> findAllProvincias() {
        return dao.getAll();
    }

}
