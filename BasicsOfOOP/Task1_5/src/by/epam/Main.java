package by.epam;

/**
������� ���������� ����������, ��������������� ��������� �����������:  
� ��������� ������������� � ���������� ���������� ������� ������.  
� ��� �������� �������� �� �������� ������� ���������� ����������� ������������� 
  ����������� �������� ��������������. 
� ���������� �������� ������, �������� �������������, �� �� �� ������� �������. 
� ��� �������� ������������ ���������� ������ ����� ��������� ���������� ���������. 
� ���� ������ �������� ������������� ����� �� �������������, ����������� ��������. 
� ������ �������: ��������������, ��� ����������, ������ toString(), equals() � hashCode(). 
 

 
������� B. �������. ����������� ����������, ����������� ��������� ������� (������, �������������� ����� �������).
 ������������� ������ ������� �������� �������� � ��������. 
*/

public class Main {
    public static void main(String[] args) {
        Menu.createPresent();
        Menu.createAPackage();
        Menu.addSweets();
        System.out.println(Menu.getPresent());
    }
}
