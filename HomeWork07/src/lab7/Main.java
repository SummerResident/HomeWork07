package lab7;

import lab7.DepositorInformation.ContractType;

public class Main {
	public static void main(String[] args) {
		DepositorInformation depositor1 = new DepositorInformation("����� ������� ����������", 123455, "������� ������");
		depositor1.chooseContract(ContractType.CUSTOMARYCONTRACT);
		System.out.println(depositor1);
		System.out.println("_______________________________");
		System.out.println();
		DepositorInformation depositor2 = new DepositorInformation("�������� ����� ����������", 123567, "����");
		depositor2.chooseContract(ContractType.PREMIUMCONTRACT);
		System.out.println(depositor2);
	}
}
