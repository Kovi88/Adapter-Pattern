package AdapterPattern;

public interface CaracteristiciEuropa { // declararea variabilelor si functiilor
	
	public String getModelEU();
	public Double getPretEU();
	public String getCombustibilEU();
	public String getCapacitateEU();
	public Double getPutereEU();
	public String getCutieEU();
	public Double getConsumEU();
	public Double getVitezaMaxEU();
	
	public void setModelEU(String modelEU);
	public void setPretEU(Double pretEU);
	public void setCombustibilEU(String combustibilEU);
	public void setCapacitateEU(String capacitateEU);
	public void setPutereEU(Double putereEU);
	public void setCutieEU(String cutieEU);
	public void setConsumEU(Double consumEU);
	public void setVitezaMaxEU(Double vitezaMaxEU);
}

