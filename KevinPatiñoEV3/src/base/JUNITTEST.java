package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITTEST {

	@Test
	void testSolicitarPermiso() {
		assertFalse(Principal.solicitarPermiso(20));
        assertTrue(Principal.solicitarPermiso(90));

	}

}
