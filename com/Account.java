package cm.com;

import java.util.Scanner;
	 
public class Account {
		
	public int id;
	public String name;
	public int password;
	public int money;
	private static Scanner sc;
		
		//����Account()�������˻����˺š����롢���������
	public Account(int id, String name, int password, int money) {
		    this.id = id;
		    this.name = name;
		    this.password = password;
		    this.money = money;
		}
		
		//����Display()����ʾ�˻����˺š������������Ϣ
	public void Display(){
		    System.out.println("�˻���" + id);
		    System.out.println("������" + name);
		    System.out.println("��" + money);
		}
		
		/*ȡ��� takeMoney()�������û�����������֤��
		������ȷ������ȡ���ȡ��ɹ�����������Ӧ�Ľ��*/
	public void takeMoney(){
		    while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("���������������֤��");
			int pass = sc.nextInt();
			if(pass == 7777777){
			    System.out.println("��������Ҫȡ��Ľ�");
			    int withdrawals = sc.nextInt();
			    if(withdrawals <= money) {
				money= money-withdrawals;
				System.out.println("�˻���" + money);
			    }else {
				System.out.println("��ǰ���㣡");
			    }
			    break;
			}else {
			    System.out.println("������������������������룡");
			}
			sc.close();
		    }
		}
		
		/*���� saveMoney(int moneys)��
		�����ֱ�Ӵ�������˻����������Ӧ�Ľ��*/
	public void saveMoney(int inmoney){	
		    money = money + inmoney;
		    System.out.println("�˴δ��Ϊ��" + inmoney);
		    System.out.println("�˻���" + money);
		}
		
	public static void main(String[] args) {
		    Account acc = new Account(10000,"С��",123456,1000000000);
		    sc = new Scanner(System.in);
		        while(true) {
			    System.out.println("---��ӭ���������˻�����ϵͳ---");
			    System.out.println("---------1�����˻���Ϣ--------");
			    System.out.println("---------2ȡ�����------------");
			    System.out.println("---------3������------------");
			    System.out.println("---------4�˳�ϵͳ------------");
			    System.out.println("------------------------------");
			    int choice = sc.nextInt();
				switch(choice) {
				case 1:
				    System.out.println("---�����˻���Ϣ---");
				    acc.Display();
				    break;
				case 2:
				    System.out.println("---ȡ�����---");
				    acc.takeMoney();
				    break;
				case 3:
				    System.out.println("---������---");
				    acc.saveMoney(1000);
				    break;
				case 4:
				    System.exit(0);
				    break;
				default:
				    System.out.println("����ѡ������");
				    break;
			}
		}
	}
}


