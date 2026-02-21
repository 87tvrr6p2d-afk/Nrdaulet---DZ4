public class Skill implements Cloneable {
    private String name;

    public Skill(String name) {
        this.name = name;
    }

    @Override
    protected Skill clone() throws CloneNotSupportedException {
        return (Skill) super.clone();
    }
}
