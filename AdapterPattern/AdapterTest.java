package AdapterPattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdapterTest {

	@Test
	public void testGetModelEU() {
		Adapter adapter = new Adapter();
		adapter.setModelEU("A4");
		assertTrue(adapter.getModelEU() == "A4");
	}
	
	@Test
	public void testGetPutereEU() {
		Adapter adapter = new Adapter();
		adapter.setPutereEU(77.0);
		assertTrue(adapter.getPutereEU() == 77.0);
	}
	
	@Test
	public void testSetCombustibilEU() {
		Adapter adapter = new Adapter();
		adapter.setCombustibilEU("benzina");
		assertTrue(adapter.getCombustibilEU() == "benzina");
	}
	
	@Test
	public void testSetVitezaMaxEU() {
		Adapter adapter = new Adapter();
		adapter.setVitezaMaxEU(210.0);
		assertTrue(adapter.getVitezaMaxEU() == 210);
	}

}
