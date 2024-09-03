package com.example.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "tbl_rentas")
public class Renta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "fecha_registro")
	private String fechaRegistro;
	@Column(name = "fecha_devolucion")
	private String fechaDevolucion;
	@Column(name = "fecha_entrega")
	private String fechaEntrega;
	
	@ManyToOne
	@JoinColumn(name = "pelicula_id",referencedColumnName = "id")
	private Pelicula pelicula;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id",referencedColumnName = "id")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id",referencedColumnName = "id")
	private Cliente cliente;
}
