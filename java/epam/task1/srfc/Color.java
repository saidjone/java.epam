package java.epam.task1.srfc;

import java.util.Random;
public enum Color {
    GREEN, BLUE, WHITE, GREY, PURPLE, RED, BROWN;

    public static Color getRandomColor(){
        Random rnd = new Random();
        Color[] colors = Color.values();
        return colors[(rnd.nextInt(3))];
    }

}