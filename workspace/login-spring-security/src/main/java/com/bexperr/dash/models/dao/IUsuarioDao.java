package com.bexperr.dash.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;

import com.bexperr.dash.models.entity.Usuario;

@Controller
public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);

	

}
