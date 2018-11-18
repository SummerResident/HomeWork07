package lab7;

import lab7.DepositorInformation.ContractType;

public class Main {
	public static void main(String[] args) {
		DepositorInformation depositor1 = new DepositorInformation("Кацюк Дмитрий Генадиевич", 123455, "Красные хуторы");
		depositor1.chooseContract(ContractType.CUSTOMARYCONTRACT);
		System.out.println(depositor1);
		System.out.println("_______________________________");
		System.out.println();
		DepositorInformation depositor2 = new DepositorInformation("Барталев Павел Эдуардович", 123567, "дома");
		depositor2.chooseContract(ContractType.PREMIUMCONTRACT);
		System.out.println(depositor2);
	}
}
