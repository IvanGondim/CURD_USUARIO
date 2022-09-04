package br.net.silva.daniel.cadastro.repository;

import br.net.silva.daniel.cadastro.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String> {
}
