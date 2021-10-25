package Net.SoftwareII.BackendCursoJava;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends CrudRepository <UserEntity,Long> {
    
}
