import java.util.ArrayList;
import java.util.List;

public class Character implements Cloneable {

    private int health;
    private Weapon weapon;
    private List<Skill> skills = new ArrayList<>();

    public Character(int health, Weapon weapon) {
        this.health = health;
        this.weapon = weapon;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    @Override
    protected Character clone() throws CloneNotSupportedException {
        Character cloned = (Character) super.clone();
        cloned.weapon = weapon.clone();
        cloned.skills = new ArrayList<>();
        for (Skill s : skills) {
            cloned.skills.add(s.clone());
        }
        return cloned;
    }
}
