package com.projects.quizz.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<ENTITY> {

    List<ENTITY> findAll() throws SQLException;

    ENTITY findById(Long id) throws SQLException;

    boolean deleteById(Long id) throws SQLException;
}
