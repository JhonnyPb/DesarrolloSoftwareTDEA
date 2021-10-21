package Net.SoftwareII.BackendCursoJava.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Net.SoftwareII.BackendCursoJava.Modells.Request.UserDetailRequestModel;
import Net.SoftwareII.BackendCursoJava.Modells.Responses.UserRest;

@RestController
@RequestMapping("/users") //localHost/users
public class UserControllers {
    

   @GetMapping
   public String getUser(){
       return "Obtener Usuarios";
   }

   @PostMapping
   public UserRest creandoUsers(@RequestBody UserDetailRequestModel userDetails){
       return null;
   }

   @DeleteMapping
   public String eliminar(){
       return "eliminando Usuario";
   }

}
