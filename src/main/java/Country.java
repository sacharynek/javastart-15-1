import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    private String iso;
    private String country;
    private int population;

    @Override
    public String toString(){
        return this.country + " ("+this.iso+") ma "+this.population+" ludności";
    }
}
