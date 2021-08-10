package apellido.nombre;

import org.junit.Test;

public class TelepaseTest {

	@Test
	public void queVerificaQueSeEncuentreElTagConIdUno() throws TagNoEncontradoException {
		// Para este test se debeinvocar al metodo public Boolean verifcarExiste(Tag
		// tag)
		// el mismo no se puede modificar

		Telepase telepase = new Telepase(1);
		Tag tagInicial = new Tag(1);
		telepase.verifcarExiste(tagInicial);

	}

	@Test(expected = SaldoInsuficienteError.class)
	public void queAlPasarAutobusconSaldoInsuficienteLanceUnaExcepcion()
			throws VehiculoNoPermitidoException, TagNoEncontradoException, SaldoInsuficienteError {

		Telepase telepase = new Telepase(1);
		Tag tag2 = new Tag(2);
		telepase.cargarTag(tag2);
		tag2.setSaldo(100.0);
		Vehiculo vehiculo = new AutoBus("AB123", tag2);

		telepase.pagarAutomatico(vehiculo);

	}

	@Test(expected = TagNoEncontradoException.class)
	public void queAlPasarUnAutobusconUnTagInvalidoLanceUnaExcepcion()
			throws VehiculoNoPermitidoException, TagNoEncontradoException, SaldoInsuficienteError {

		Telepase telepase = new Telepase(1);
		Tag tag2 = new Tag(2);
		tag2.setSaldo(100.0);
		Vehiculo vehiculo = new AutoBus("AB123", tag2);

		telepase.pagarAutomatico(vehiculo);

	}

}
