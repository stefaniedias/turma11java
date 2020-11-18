package org.generation.blohgPessoal.seguranca;
	
	import java.util.Optional;

import org.generation.blohgPessoal.model.UsuarioModel;
import org.generation.blohgPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



	@Service
	public class UserDetailsServiceImpl implements UserDetailsService {

		@Autowired
		private UsuarioRepository userRepository;

		@Override
		public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

			Optional<UsuarioModel> user = userRepository.findByUsuario(userName);
			user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));

			return user.map(UserDetailsIpml::new).get();
		}
	}
	
	
	
	
