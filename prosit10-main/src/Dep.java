import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Dep {
    private int id;
    private String name;
    private int nbrEmployees;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Dep)) return false;
        Dep dep = (Dep) obj;
        return this.id == dep.id && this.name.equals(dep.name);
    }
}
