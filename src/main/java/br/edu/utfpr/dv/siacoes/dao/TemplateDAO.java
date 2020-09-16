package br.edu.utfpr.dv.siacoes.dao;

import java.util.List ;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public abstract class TemplateDAO<T> {
    public abstract List <T> listAll() throws SQLException;

    public abstract T findById(int id) throws SQLException;

    public abstract T loadObject(ResultSet rs) throws SQLException;

    public abstract save(int idUser, T unit) throws SQLException;

}
