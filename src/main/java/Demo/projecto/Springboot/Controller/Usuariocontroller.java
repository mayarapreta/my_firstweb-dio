package Demo.projecto.Springboot.Controller;

import Demo.projecto.Springboot.Repositorio.UseRepository;
import Demo.projecto.Springboot.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestConteoller
@RequestMapping("/user")
public class Usuariocontroller {
    @Autowired
    private UseRepository.UsuarioRepository repository;
   @GetMapping()
    public List<Usuario> getUser(){
return repository.listAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable( "username") String username) {
       return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void delete (Integer id) {
       repository.deleteByid(id);
    }
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
       repository.save(usuario);
    }

@PutMapping()

public  void putUser(@RequestBody Usuario usuario){
    repository.save(usuario);
}
}
