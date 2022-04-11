package java.epam.task1.srfc;

public class Calculator {
    public static int calculateCartWeight(CartforBall basket) {
        int length = basket.getCart().size();
        int weight = 0;
        int i=0;
        while(i<length){
            weight = weight + basket.getCart().get(i).getWeight();
            i++;
        }
        return weight;
    }
    public static int countColoredBalls(Color color, CartforBall basket){
        int length = basket.getCart().size();
        int amount = 0;

        for (int i = 0;i<length;i++){
        if (basket.getCart().get(i).getColor()==color){
            amount++;
         }
        }
        return amount;
    }

    private Calculator() {
    }
}
