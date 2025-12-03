package com.dougfsilva.MyMsep.models.usuario;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Usuario implements UserDetails{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String CPF;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Embedded
	@Column(nullable = false)
	private SenhaDeUsuario senha;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_id", nullable = false)
	private Perfil perfil;
	
	public Usuario(String nome, String CPF, String email, SenhaDeUsuario senha, Perfil perfil) {
		this.nome = nome;
		this.CPF = CPF;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
	}
	
	public String infoParaLog() {
		return String.format("(ID: #%d) %s", this.id, this.nome);
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	    return this.perfil != null ? Collections.singletonList(this.perfil) : Collections.emptyList();
	}

	@Override
	public String getPassword() {
		return this.senha.getSenha();
	}

	@Override
	public String getUsername() {
		return this.email;
	}

}
