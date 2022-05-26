package com.projects.quizz.dao;

import com.projects.quizz.models.*;
import com.projects.quizz.models.db.TableName;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetConverter {
    public static User convertToUser(ResultSet resultSet) throws SQLException {
        Integer id = resultSet.getInt("id");
        String lastname = resultSet.getString("lastname");
        String firstname = resultSet.getString("firstname");
        String pseudo = resultSet.getString("pseudo");
        String avatar = resultSet.getString("avatar");
        String email = resultSet.getString("email");
        String password = resultSet.getString("password");
        boolean isVerified = resultSet.getBoolean("is_verified");
        Integer idRole = resultSet.getInt("id");
        String name = resultSet.getString("role.name");
        Role role = new Role(idRole, name);

        return new User(id, lastname, firstname, email, password, isVerified, pseudo, avatar, role);
    }

    public static Role convertToRole(ResultSet resultSet) throws SQLException {
        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("name");

        return new Role(id, name);
    }

    public static Question convertToQuestion(ResultSet resultSet) throws SQLException {
        Integer id = resultSet.getInt("id");
        String wording = resultSet.getString("wording");
        Answer answer = new Answer();
        Theme theme = new Theme();
        Level level = new Level();

        return new Question(id, wording, answer, theme, level);
    }

    public static Answer convertToAnswer(ResultSet resultSet) throws SQLException{
        Integer id = resultSet.getInt("id");
        String wording = resultSet.getString("wording");
        boolean isRight = resultSet.getBoolean("isRight");

        return new Answer(id, wording, isRight);
    }

    public static Theme convertToTheme(ResultSet resultSet) throws SQLException{
        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("name");

        return new Theme(id, name);
    }

    public static Level convertToLevel(ResultSet resultSet) throws SQLException{
        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("name");

        return new Level(id, name);
    }

    static <T> T getModelFromResult(TableName tableName, ResultSet resultSet) throws SQLException{

        if (tableName.equals(TableName.USER)){
            return (T) convertToUser(resultSet);

        } else if (tableName.equals(TableName.ROLE)){
            return (T) convertToRole(resultSet);

        } else if (tableName.equals(TableName.QUESTION)){
            return (T) convertToQuestion(resultSet);

        } else if (tableName.equals(TableName.ANSWER)) {
            return (T) convertToAnswer(resultSet);

        } else if (tableName.equals(TableName.THEME)){
            return (T) convertToTheme(resultSet);

        } else if ((tableName.equals(TableName.LEVEL))){
            return (T) convertToLevel(resultSet);

        }

        return null;
    }
}
