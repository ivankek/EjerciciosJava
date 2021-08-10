package apellido.nombre;

import java.util.HashSet;
import java.util.Set;

public class Telepase extends Cabina {

	/*
	 * Atribito donde se almacentodos los tags habilitados para el telepase No se
	 * permiten tags duplicados ( 2 tags son iguales cuando tienen el mismo id)
	 */
	private Set<Tag> tags = new HashSet<Tag>();

	public Telepase(Integer numero) {
		super(numero);

		// siempre al momento de crear un telepase se crea el tag 1 con 200 pesos de
		// carga
		Tag tagInicial = new Tag(1);
		tagInicial.setSaldo(200.0);
		this.cargarTag(tagInicial);
	}

	public Boolean cargarTag(Tag tag) {

		return tags.add(tag);

	}

	/*
	 * Este metodo es pago automatico y en estas cabinas solamente estan habilitados
	 * los autobuses Al momento de pasar un autobus se descuenta el importe del tag
	 * asociado al autobus y se incrementa la recaudacion de la cabina y tambien se
	 * tiene que incrementar el contador de AutoBus
	 * 
	 * Validaciones 1) en caso que el tag no este registrado lanza una
	 * TagNoEncontradoException 2) en caso que el vehiculo que ingreso al telepase
	 * no es un AutoBus lanza una VehiculoNoPermitidoExceptions 3) en caso que el
	 * importe que tiene el tag no alcanza para pagar el peaje laza una
	 * SaldoInsuficienteError
	 * 
	 */
	public void pagarAutomatico(Vehiculo vehiculo)
			throws VehiculoNoPermitidoException, TagNoEncontradoException, SaldoInsuficienteError {

		if (vehiculo instanceof AutoBus) {

			if (verifcarExiste(((AutoBus) vehiculo).getTag()) != true) {

				throw new TagNoEncontradoException("No se encontró su tag");

			} else {

				if (((AutoBus) vehiculo).getTag().getSaldo() < 200.0) {

					throw new SaldoInsuficienteError("No tiene saldo suficiente para pagar el peaje");

				} else {

					((AutoBus) vehiculo).getTag().setSaldo(((AutoBus) vehiculo).getTag().getSaldo() - 200.0);
					setRecaudacion(getRecaudacion() + 200.0);

					if (getContadorDeVehiculos().containsKey(vehiculo.getTipo())) {

						getContadorDeVehiculos().replace(vehiculo.getTipo(),
								getContadorDeVehiculos().get(vehiculo.getTipo()) + 1);

					} else {

						getContadorDeVehiculos().put(vehiculo.getTipo(), 1);

					}

				}
			}

		} else {

			throw new VehiculoNoPermitidoException("No se permite otro vehiculo que no sea un autobus");

		}

	}

//Verifica que si existe el tag
	public Boolean verifcarExiste(Tag tag) throws TagNoEncontradoException {
		// No Se Puede modificar el comportamiento de este metodo
		// Los tags son iguales cuando tiene el mismo id

		for (Tag tagLeido : tags) {
			if (tagLeido.equals(tag))
				return Boolean.TRUE;
		}

		throw new TagNoEncontradoException("No se encontró su tag");
	}

}
