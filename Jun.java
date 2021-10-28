import java.util.Objects;

public class Jun extends Employee {
    private final String engKnowledge;

    public Jun(String name, int age, String engKnowledge) {
        super(name, age);
        this.engKnowledge=engKnowledge;
    }

    public Jun(String name, int age) {
        super(name, age);
        this.engKnowledge="Unknown";
    }

    public String getEngKnowledge() {
        return engKnowledge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jun)) return false;
        if (!super.equals(o)) return false;
        return ((Jun) o).getEngKnowledge()==this.getEngKnowledge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEngKnowledge());
    }

    @Override
    public String toString() {
        return (super.toString()+"\nEnglish knowledge: "+engKnowledge);
    }
    public Jun clone(){
        return new Jun(super.getName(), super.getAge(), engKnowledge);
    }
    public Jun createDifJun(String name, int age, String engKnowledge){
        return new Jun(name, age, engKnowledge);
    }
}