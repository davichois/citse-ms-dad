package com.sg.citse.repository;

import com.sg.citse.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Integer> {

    public Usuario findByNuUsuarioAndEsUsuario(String nuUsuario, Boolean esUsuario);

    @RestResource(path = "obtener-numero")
    @Query("select u from Usuario u where u.nuUsuario=?1")
    public Usuario obtenerPorNuUsuario(String nuUsuario);

    @RestResource(path = "estado")
    public List<Usuario> findByEsUsuario(@Param("is") Boolean estado);

}
