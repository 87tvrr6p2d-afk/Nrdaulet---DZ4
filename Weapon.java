public class Weapon implements Cloneable {
    private int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    @Override
    protected Weapon clone() throws CloneNotSupportedException {
        return (Weapon) super.clone();
    }
}
