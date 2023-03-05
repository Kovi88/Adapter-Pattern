package AdapterPattern;

public class Adapter implements CaracteristiciEuropa {

	private String modelEU;
	private Double pretEU;
	private String combustibilEU;
	private String capacitateEU;
	private Double putereEU;
	private String cutieEU;
	private Double consumEU;
	private Double vitezaMaxEU;
	
	private final CaracteristiciAmerica caracteristiciAmerica;
	
	public Adapter(CaracteristiciAmerica caracteristiciAmerica) {
		this.caracteristiciAmerica = caracteristiciAmerica; // declararea obiectului care va urma conceptul adapter
		setCaracteristici();
	}
	
	// functiile get returneaza campurile atribuite caracteristicilor masinii 
	@Override
	public String getModelEU() {
		return modelEU;
	}
	
	@Override
	public Double getPretEU() {
		return pretEU;
	}
	
	@Override
	public String getCombustibilEU() {
		return combustibilEU;
	}
	
	@Override
	public String getCapacitateEU() {
		return capacitateEU;
	}
	
	@Override
	public Double getPutereEU() {
		return putereEU;
	}
	
	@Override
	public String getCutieEU() {
		return cutieEU;
	}
	
	@Override
	public Double getConsumEU() {
		return consumEU;
	}
	
	@Override
	public Double getVitezaMaxEU() {
		return vitezaMaxEU;
	}
	
	// functiile set seteaza valorile curente corespunzatoare caracteristicilor masinii
	@Override
	public void setModelEU(String modelEU) {
		this.modelEU = modelEU;
	}
	
	@Override
	public void setPretEU(Double pretEU) {
		this.pretEU = pretEU;
	}
	
	@Override
	public void setCombustibilEU(String combustibilEU) {
		this.combustibilEU = combustibilEU;
	}
	
	@Override
	public void setCapacitateEU(String capacitateEU) {
		this.capacitateEU = capacitateEU;
	}
	
	@Override
	public void setPutereEU(Double putereEU) {
		this.putereEU = putereEU;
	}
	
	@Override
	public void setCutieEU(String cutieEU) {
		this.cutieEU = cutieEU;
	}
	
	@Override
	public void setConsumEU(Double consumEU) {
		this.consumEU = consumEU;
	}
	
	@Override
	public void setVitezaMaxEU(Double vitezaMaxEU) {
		this.vitezaMaxEU = vitezaMaxEU;
	}
	
	private void setCaracteristici() { // functia care conecteaza clasele CaracteristiciAmerica si CaracteristiciEuropa fara a le altera
		
		setModelEU(this.caracteristiciAmerica.getModelA()); 
		setPretEU(0.92 * this.caracteristiciAmerica.getPretA()); // transformarea pretului din dolari in euro
		setCombustibilEU(this.caracteristiciAmerica.getCombustibilA());
		setCapacitateEU(this.caracteristiciAmerica.getCapacitateA()); 
		setPutereEU(1.36 * this.caracteristiciAmerica.getPutereA()); // transformarea puterii din kilowatti in cai putere
		setCutieEU(this.caracteristiciAmerica.getCutieA());
		setConsumEU(235.2 / this.caracteristiciAmerica.getConsumA()); // transformarea consumului din mile pe galon in litri la 100 km 
		setVitezaMaxEU(1.61 * this.caracteristiciAmerica.getVitezaMaxA()); // transformarea vitezei din mile pe ora in kilometri pe ora
	}
	
}
