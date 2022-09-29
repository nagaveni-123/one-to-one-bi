import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int cost;
	@OneToOne
	@JoinColumn
	private Charcy charcy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Charcy getCharcy() {
		return charcy;
	}
	public void setCharcy(Charcy charcy) {
		this.charcy = charcy;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", cost=" + cost + ", charcy=" + charcy + "]";
	}
	
	

}
