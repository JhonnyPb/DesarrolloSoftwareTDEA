package Net.SoftwareII.BackendCursoJava.Controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Net.SoftwareII.BackendCursoJava.Modells.Request.UserDetailRequestModel;
import Net.SoftwareII.BackendCursoJava.Modells.Responses.UserRest;
import Net.SoftwareII.BackendCursoJava.Servicess.UserServicessInterfaces;
import Net.SoftwareII.BackendCursoJava.Shared.DTO.UserDto;

@RestController
@RequestMapping("/users") //localHost/users
public class UserControllers {
    

    @Autowired
    UserServicessInterfaces userService;

   @GetMapping
   public String getUser(){
       return "Obtener Usuarios";
   }

   @PostMapping
   public UserRest createUser (@RequestBody UserDetailRequestModel userDetails){
       UserRest userToReturn = new UserRest();
       UserDto  userDTO = new UserDto();
       BeanUtils.copyProperties(userDetails, userDTO);
       UserDto createdUser = userService.createUser(userDTO);
       BeanUtils.copyProperties(createdUser, userToReturn);

       return userToReturn;
   }

 
}
