package java.epam.task1.srfc;


public class GivenBall {
    private int weight;
    Color color;

    public GivenBall(int weight, Color color){
        this.weight = weight;
        this.color = color;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GivenBall givenBall = (GivenBall) o;

        if (weight != givenBall.weight) return false;
        return color != null ? color.equals(givenBall.color) : givenBall.color == null;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}