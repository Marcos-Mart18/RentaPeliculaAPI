package com.example.demo.Entity;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbl_usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "estado")
	private char estado;
	
	
	@OneToOne
	@JoinColumn(name = "empleado_id")
	private Empleado empleado;
	
	@ManyToMany
	@JoinTable(
			name = "usuario_rol",
			joinColumns = @JoinColumn(name="usuario_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="rol_id",referencedColumnName = "id")
			)
	@JsonIgnore
	private Set<Rol>roles;
	
	
	@OneToMany(mappedBy = "usuario")
	@JsonIgnore
	private List<Renta>rentas;
}
