public class Main {
    public static void main(String[] args) {
        int coffeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        boolean isBloked = true;

        int cappuchinoMilkRequired = 60;
        int cappucianoCoffeRequired = 15;

        if(!isBloked){
            System.out.println("Попробуем приготовить кофе");
        }else {
            System.out.println("Кофемашина заблокирована");
        }
        if(skimmedMilkAmount >= cappuchinoMilkRequired || milkAmount >= cappuchinoMilkRequired){
            System.out.println("Молока достаточно");
        }else {
            System.out.println("Молока недостаточно");
        }
        if(coffeAmount >= cappuchinoMilkRequired && milkAmount >= cappuchinoMilkRequired) {
            System.out.println("Готовим капучино");
        } else {
            System.out.println("Ингридиентов недостаточно =(");
        }
    }
}
