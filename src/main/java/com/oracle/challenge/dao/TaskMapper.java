package com.oracle.challenge.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.oracle.challenge.core.Task;


public class TaskMapper implements ResultSetMapper<Task>{

	public Task map(int i, ResultSet resultSet, StatementContext statementContext)throws SQLException {
		return new Task(Long.parseLong( 
						resultSet.getString("id") ), 
						resultSet.getString("description"), 
						resultSet.getString("date") );
	}

}
