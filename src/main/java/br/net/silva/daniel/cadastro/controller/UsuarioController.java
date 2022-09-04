package br.net.silva.daniel.cadastro.controller;

import br.net.silva.daniel.cadastro.dto.UsuarioDTO;
import br.net.silva.daniel.cadastro.model.UsuarioEntity;
import br.net.silva.daniel.cadastro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private UsuarioRepository repository;

    @Autowired
    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrar(@RequestBody UsuarioDTO usuario) {
        UsuarioEntity entity = new UsuarioEntity();
        entity.setCpf(usuario.getCpf());
        entity.setNome(usuario.getNome());
        entity.setIdade(usuario.getIdade());
        entity.setSexo(usuario.getSexo());
        repository.save(entity);
    }

    @GetMapping("/{cpf}")
    public UsuarioDTO obterUsuarioPorCpf(@PathVariable("cpf") String cpf) {
        return new UsuarioDTO(repository.getReferenceById(cpf));
    }

    @GetMapping
    public List<UsuarioDTO> usuarios() {
        return repository
                .findAll()
                .stream()
                .map(UsuarioDTO::new)
                .collect(Collectors.toList());
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void atualizarUsuario(@RequestBody UsuarioDTO usuario) {
        UsuarioEntity entity = new UsuarioEntity();
        entity.setCpf(usuario.getCpf());
        entity.setNome(usuario.getNome());
        entity.setIdade(usuario.getIdade());
        entity.setSexo(usuario.getSexo());
        repository.save(entity);
    }

    @DeleteMapping("/{cpf}")
    public void deletar(@PathVariable("cpf") String cpf) {
        repository.deleteById(cpf);
    }
}
