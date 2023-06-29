/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_05_ssuquilanda_jabad.dao;

import ec.edu.ups.practica_05_ssuquilanda_jabad.idao.ICantanteDAO;
import ec.edu.ups.practica_05_ssuquilanda_jabad.modelo.Cantante;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class CantanteDAO implements ICantanteDAO{
    private List<Cantante> listaCantante;


    public CantanteDAO() {
        listaCantante = new ArrayList<>();
    }

    @Override
    public void create(Cantante cantante) {
        listaCantante.add(cantante);
    }

    @Override
    public Cantante read(int id) {
        for (Cantante cantante : listaCantante) {
            if (cantante.getCodigo() == id) {
                return cantante;
            }
        }
        return null;
    }

    @Override
    public void update(Cantante cantante) {
        for (int i = 0; i < listaCantante.size(); i++) {
            Cantante c = listaCantante.get(i);
            if (c.getCodigo() == cantante.getCodigo()) {
                listaCantante.set(i, cantante);
                break;
            }
        }

    }

    @Override
    public void delete(Cantante cantante) {
        Iterator<Cantante> it = listaCantante.iterator();
        while (it.hasNext()) {
            Cantante c = it.next();
            if (c.getCodigo() == cantante.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cantante> findAll() {
        return listaCantante;
    }

}
