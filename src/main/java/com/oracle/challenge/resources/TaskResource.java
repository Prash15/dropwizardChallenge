package com.oracle.challenge.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.oracle.challenge.core.Task;
import com.oracle.challenge.dao.MyDao;

@Path("/task")
public class TaskResource {

  private MyDao myDao;

  public TaskResource(MyDao myDao) {
    this.myDao = myDao;
  }

  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public List<Task> getTasks() {
    return myDao.getTaskList();
  }

  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  public void addTask(Task newTask) {
    myDao.insertToTask(newTask.getDescription());
  }

  @Path("{id}")
  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces({MediaType.APPLICATION_JSON})
  public boolean updateTask(@PathParam("id") String id, Task updateTask) {
    if (myDao.existsTask(id)) {
      myDao.updateTask(id, updateTask.getDescription());
      return true;
    } else {
      return false;
    }
  }

  @Path("{id}")
  @DELETE
  public void delete(@PathParam("id") String id) {
    myDao.deleteTask(id);
  }

}
