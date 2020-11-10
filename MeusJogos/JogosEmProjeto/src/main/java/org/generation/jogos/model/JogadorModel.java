package org.generation.jogos.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Size;
	@Entity
	@Table(name = "tb_jogador")
	public class JogadorModel {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column
		@NotNull
		@Size(min = 2, max = 50)
		private String nome;
		
		@Column
		@NotNull
		@Size(min = 5, max = 30)
		private String email;
		
		@Column
		@NotNull
		@Size(min = 4, max = 100)
		private String senha;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		
		

	
	
}
