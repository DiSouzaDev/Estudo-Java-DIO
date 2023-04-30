package dio.myFyrstApi.controller;

import dio.myFyrstApi.model.Usuario;
import dio.myFyrstApi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping()

    public List<Usuario> getUsers(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return usuarioRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        usuarioRepository.deleteById(id);
    }

    @PostMapping()
    public void postUser(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @PutMapping
    public void putUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
}