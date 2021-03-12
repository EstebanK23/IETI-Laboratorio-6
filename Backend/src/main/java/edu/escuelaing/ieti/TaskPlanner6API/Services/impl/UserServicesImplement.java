package edu.escuelaing.ieti.TaskPlanner6API.Services.impl;

import edu.escuelaing.ieti.TaskPlanner6API.Model.User;
import edu.escuelaing.ieti.TaskPlanner6API.Services.UserServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServicesImplement implements UserServices {
    List<User> Usuarios = new ArrayList<>(Arrays.asList(
            new User("1","esteban","2302","esteban@gmail.com"),
            new User("2","daniel","6789","daniel@gmail.com"),
            new User("3","juliana","1234","juliana@gmail.com")));

    @Override
    public List<User> getAll() {
        return Usuarios;
    }

    @Override
    public User getById(String userId) {
        User usuario = null;
        for(User us: Usuarios){
            if(us.getId().equals(userId)){
                usuario = us;
            }
        }
        return usuario;
    }

    @Override
    public User create(User user) {
        Usuarios.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        return user;
    }

    @Override
    public void remove(String userId) {
        for(User us: Usuarios){
            if(us.getId().equals(userId)){
                Usuarios.remove(us);
            }
        }
    }
}
