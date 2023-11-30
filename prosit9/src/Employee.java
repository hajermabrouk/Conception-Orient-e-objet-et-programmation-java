import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private String lastName;
    private String depName;
    private int grade;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return (this.id == other.id)&&(this.name.equals(other.name));
    }
}
