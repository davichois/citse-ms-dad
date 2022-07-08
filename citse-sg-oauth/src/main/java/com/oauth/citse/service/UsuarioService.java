package com.oauth.citse.service;

import com.oauth.citse.FeignClients.sgFeignClient;
import com.oauth.citse.models.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService implements UserDetailsService {

    private Logger log = LoggerFactory.getLogger(UsuarioService.class);

    @Autowired
    private sgFeignClient feignClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = feignClient.getUsuario(username);
        if(usuario==null){
            log.error("no existe usuario con : '"+username+"' :(");
            throw new UsernameNotFoundException("no existe usuario con : '"+username+"' :(");
        }
        List<GrantedAuthority> authorities = usuario.getRoles().stream().map( role -> new SimpleGrantedAuthority(role.getNoRol())).collect(Collectors.toList());

        log.info("usuario autenticado : "+ username);

        return new User(usuario.getNuUsuario(),usuario.getPwUsuario(),usuario.getEsUsuario(),
                true,true,true,authorities);


    }
}
