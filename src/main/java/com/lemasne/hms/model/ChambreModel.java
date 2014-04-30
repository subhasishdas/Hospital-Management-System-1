package com.lemasne.hms.model;

import com.lemasne.hms.interfaces.IDao;
import com.lemasne.hms.interfaces.IModel;
import com.lemasne.hms.model.dao.ChambreDao;
import com.lemasne.hms.tools.DatabaseHelpers;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ChambreModel implements IModel {

    private final IDao cDao;

    public ChambreModel() {
        this.cDao = new ChambreDao();
    }

    public DefaultTableModel getTableModel() {
        return DatabaseHelpers.getTableModel(this.cDao);
    }

    @Override
    public TableModel getCustomizeTableModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
