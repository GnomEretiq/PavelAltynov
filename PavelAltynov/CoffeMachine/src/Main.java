public class Main {
    public static void main(String[] args) {
        int coffeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        boolean isBloked = true;

        int cappuchinoMilkRequired = 60;
        int cappucianoCoffeRequired = 15;

        if(!isBloked){
            System.out.println("��������� ����������� ����");
        }else {
            System.out.println("���������� �������������");
        }
        if(skimmedMilkAmount >= cappuchinoMilkRequired || milkAmount >= cappuchinoMilkRequired){
            System.out.println("������ ����������");
        }else {
            System.out.println("������ ������������");
        }
        if(coffeAmount >= cappuchinoMilkRequired && milkAmount >= cappuchinoMilkRequired) {
            System.out.println("������� ��������");
        } else {
            System.out.println("������������ ������������ =(");
        }
    }
}
