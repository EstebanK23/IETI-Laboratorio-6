package edu.escuelaing.ieti.TaskPlanner6API.Controllers;

import edu.escuelaing.ieti.TaskPlanner6API.Model.User;
import edu.escuelaing.ieti.TaskPlanner6API.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/usuarios")
public class UserController {
    @Autowired
    UserServices us;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers() {
        try{
            return new ResponseEntity<>(us.getAll(), HttpStatus.ACCEPTED);
        }catch (Exception ex){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(path = "/ById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@PathVariable(name="id") String id) {
        try{
            return new ResponseEntity<>(us.getById(id), HttpStatus.ACCEPTED);
        }catch (Exception ex){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(path = "/NuevoUser", method = RequestMethod.POST)
    public ResponseEntity<?> createUser (@RequestBody User user){
        try {
            return new ResponseEntity<>(us.create(user),HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, null);
        }
    }

    @RequestMapping(path = "/ModifyUser", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser (@RequestBody User user){
        try {
            return new ResponseEntity<>(us.update(user),HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, null);
        }
    }
    @RequestMapping(path = "/deleteUser/{iduser}", method = RequestMethod.DELETE)
    public ResponseEntity<?> removeUser(@PathVariable(name = "iduser") String iduser) {
        try {
            us.remove(iduser);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
