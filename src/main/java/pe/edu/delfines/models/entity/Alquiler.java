package pe.edu.delfines.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "alquileres")
public class Alquiler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="precio")
	private Integer precio;
	
	@Column(name="fecha_entrada")
	private Integer fechaEntrada;
	
	@Column(name="fecha_salida")
	private Integer fechaSalida;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="observacion")
	private String observacion;
	
	@JsonIgnoreProperties("alquileres")
	@ManyToOne
	@JoinColumn(name = "vendedor_id")
	private Vendedor vendedor;
	
	@JsonIgnoreProperties("alquileres")
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@JsonIgnoreProperties("alquileres")
	@ManyToOne
	@JoinColumn(name = "habitacion_id")
	private Habitacion habitacion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Integer fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Integer getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Integer fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	
	
}
