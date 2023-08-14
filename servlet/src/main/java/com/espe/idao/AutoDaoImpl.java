package com.espe.idao;

import com.espe.dao.IAutoDAO;
import com.espe.model.Auto;
import com.espe.util.MemoryStore;

import java.util.List;

public class AutoDaoImpl implements IAutoDAO {

    @Override
    public void add(Auto auto) {
        MemoryStore.addAuto(auto);
    }

   /** @Override
    public void update(Auto auto) {
        MemoryStore.addAuto(auto);
    }**/

    @Override
    public List<Auto> get() {
        return MemoryStore.getAutos();
    }

    @Override
    public Auto getAuto(String placa) {
        return MemoryStore.getAuto(placa);
    }

    @Override
    public void delete(String placa) {
        MemoryStore.deleteAuto(placa);
    }
}
