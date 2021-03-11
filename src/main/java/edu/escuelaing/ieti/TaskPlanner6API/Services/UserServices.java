package edu.escuelaing.ieti.TaskPlanner6API.Services;

import edu.escuelaing.ieti.TaskPlanner6API.Model.User;

import java.util.List;

public interface UserServices {
    List<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}
