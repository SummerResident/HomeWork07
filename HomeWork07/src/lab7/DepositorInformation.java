package lab7;

public class DepositorInformation {

	private String fio;
	private int numberContract;
	private String homeAddress;
	private int depositAmount;
	private int duration;
	private ContractType contract;

	public DepositorInformation(String fio, int numberContract, String homeAddress) {

		this.setFio(fio);
		this.setNumberContract(numberContract);
		this.homeAddress = homeAddress;
	}

	enum ContractType {
		SHORTCONTRACT, CUSTOMARYCONTRACT, PREMIUMCONTRACT;
	}

	public ContractType getContract() {
		return contract;
	}

	public void chooseContract(ContractType contract) {
		this.contract = contract;

		if (getContract() == ContractType.SHORTCONTRACT) {
			depositAmount = 300;
			duration = 3;
		} else if (getContract() == ContractType.CUSTOMARYCONTRACT) {
			depositAmount = 600;
			duration = 6;
		} else if (getContract() == ContractType.PREMIUMCONTRACT) {
			depositAmount = 1200;
			duration = 12;
		}
	}

	public String fio() {
		return fio;
	}

	private void setFio(String fio) {
		if (fio.matches("^[A-Za-zА-Яа-я].{0,64}$")) {
			this.fio = fio;
		} else {
			System.out.println("Вы ввели имя которое превышает лимит символов.");
		}
	}

	public int numberContract() {
		return numberContract;
	}

	private void setNumberContract(int numberContract) {
		if (numberContract > 99999 && numberContract <= 999999) {
			this.numberContract = numberContract;
		} else {
			System.out.println("Вы ввели неправильный номер контракта.");
		}
	}

	public String toString() {
		return "Ф.И.О.: " + fio + "\nНомер контракта: " + numberContract + "\nДомашний адрес: " + homeAddress
				+ "\nТип контракта: " + contract + "\nСумма вклада: " + depositAmount + "\nПродолжительность: "
				+ duration;
	}

}
