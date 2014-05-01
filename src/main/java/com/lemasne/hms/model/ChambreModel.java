package com.lemasne.hms.model;

import com.lemasne.hms.model.dao.ChambreDao;
import com.lemasne.hms.model.entities.Chambre;
import javax.swing.table.TableModel;

public class ChambreModel extends AbstractModel<Chambre> {

    public ChambreModel() {
        super(Chambre.class, new ChambreDao());
    }
    
    @Override
    public TableModel getCustomizeTableModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
