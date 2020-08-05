package com.formacionbdi.springboot.app.oauth.services;

import co.gov.serviciocomunes.modelo.entities.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
