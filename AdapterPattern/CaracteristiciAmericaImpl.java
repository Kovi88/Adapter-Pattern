package AdapterPattern;

public class CaracteristiciAmericaImpl implements CaracteristiciAmerica {

	private String modelA;
	private Double pretA;
	private String combustibilA;
	private String capacitateA;
	private Double putereA;
	private String cutieA;
	private Double consumA;
	private Double vitezaMaxA;
	
	// functiile get returneaza campurile atribuite caracteristicilor masinii
	@Override
	public String getModelA() {
		return modelA;
	}
	
	@Override
	public Double getPretA() {
		return pretA;
	}
	
	@Override
	public String getCombustibilA() {
		return combustibilA;
	}
	
	@Override
	public String getCapacitateA() {
		return capacitateA;
	}
	
	@Override
	public Double getPutereA() {
		return putereA;
	}
	
	@Override
	public String getCutieA() {
		return cutieA;
	}
	
	@Override
	public Double getConsumA() {
		return consumA;
	}
	
	@Override
	public Double getVitezaMaxA() {
		return vitezaMaxA;
	}
	
	// functiile set seteaza valorile curente corespunzatoare caracteristicilor masinii
	@Override
	public void setModelA(String modelA) {
		this.modelA = modelA;
	}
	
	@Override
	public void setPretA(Double pretA) {
		this.pretA = pretA;
	}
	
	@Override
	public void setCombustibilA(String combustibilA) {
		this.combustibilA = combustibilA;
	}
	
	@Override
	public void setCapacitateA(String capacitateA) {
		this.capacitateA = capacitateA;
	}
	
	@Override
	public void setPutereA(Double putereA) {
		this.putereA = putereA;
	}
	
	@Override
	public void setCutieA(String cutieA) {
		this.cutieA = cutieA;
	}
	
	@Override
	public void setConsumA(Double consumA) {
		this.consumA = consumA;
	}
	
	@Override
	public void setVitezaMaxA(Double vitezaMaxA) {
		this.vitezaMaxA = vitezaMaxA;
	}
	
}


