public class Main {
    public static void main(String[] args){
        System.out.println("������� ������� ��������� �������");

        int fuelType = 95;
        int amount = 100;
        boolean hasDiscount = amount > 10;

        double fuel92Price = 60.2;
        double fuel95Price = 67.33;
        double discount = 0.1;
        String fuelPriceMessage = "����� ��������� ��������: ";

        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92Price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95Price;
            } else {
            System.out.println("������ �������� ��� �������");
            }

        if (amount < 1) {
            System.out.println("������� ������� ����� ���������� �������");
            amount = 0;
        }
        if (hasDiscount){
            fuelPrice = (1 - discount) * fuelPrice;
        }
        System.out.println("���� ���������� �������: " + fuelPrice + " ���");

        double totalPrice = fuelPrice * amount;
        System.out.println(fuelPriceMessage + totalPrice + " ���");

    }
}
