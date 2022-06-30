package com.oracle.challenge.dao;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import com.oracle.challenge.core.Task;


//@RegisterMapper(TaskMapper.class)
public interface MyDao {

	//Task	
	@SqlQuery("select * from task")
	@Mapper(TaskMapper.class)
	public List<Task> getTaskList();
	
	@SqlUpdate("insert into task (description) values (:description)")
	void insertToTask(@Bind("description") String description);
	
	@SqlQuery("select COUNT(*) from task where id = :id")
	boolean existsTask( @Bind("id") String id );
	
	@SqlUpdate("UPDATE task SET description = :description WHERE id = :id")
	void updateTask( @Bind("id") String id, @Bind("description") String description );
	
	@SqlUpdate("DELETE FROM task WHERE id = :id")
	void deleteTask( @Bind("id") String id );
	
}
