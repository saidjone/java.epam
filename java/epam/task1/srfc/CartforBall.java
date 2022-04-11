package java.epam.task1.srfc;

import java.util.List;

public class CartforBall {
    private List<GivenBall> basket;

    public CartforBall(List<GivenBall> basket){
        this.basket = basket;
    }

    public void setCart(List<GivenBall> basket) {
        this.basket = basket;
    }

    public List<GivenBall> getCart() {
        return basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartforBall that = (CartforBall) o;

        return basket != null ? basket.equals(that.basket) : that.basket == null;
    }

    @Override
    public int hashCode() {
        return basket != null ? basket.hashCode() : 0;
    }
}