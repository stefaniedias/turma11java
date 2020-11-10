package org.generation.jogos.model;

	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Size;

	import org.hibernate.annotations.CreationTimestamp;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	@Table(name = "tb_jogos")
	public class JogosModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column
		@NotNull
		@Size(min = 2, max = 100)
		private String titulo;

		@Column
		@NotNull
		@Size(min = 10, max = 500)
		private String descricao;

		@Column
		@NotNull
		private Double Valor;

		@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
		@Temporal(TemporalType.TIMESTAMP)
		@CreationTimestamp
		private Date date = new java.sql.Date(System.currentTimeMillis());

		@ManyToOne
		@JsonIgnoreProperties("jogos")
		private Categoria categoria;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Double getValor() {
			return Valor;
		}

		public void setValor(Double valor) {
			Valor = valor;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}


}
