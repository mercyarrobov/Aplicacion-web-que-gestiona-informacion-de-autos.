package com.espe.util;

import com.espe.model.Auto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemoryStore {
    private static HashMap<String, Auto> autos = new HashMap<>();

    //Añadir un auto
    public static void addAuto(Auto auto){
        String placa = auto.getPlaca();
        if(autos.containsKey(placa)){
            autos.remove(placa);
        }
        autos.put(placa, auto);
    }
    //Listar todos los autos
    public static List<Auto> getAutos(){
        return new ArrayList<>(autos.values());
    }
    //Obtener Auto
    public static Auto getAuto(String placa){
        return autos.get(placa);
    }
}
