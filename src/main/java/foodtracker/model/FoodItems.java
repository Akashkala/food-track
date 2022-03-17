package foodtracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FoodItems")
public class FoodItems {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String apple;
	private String mango;
	private String guava;
	private String pomergrante;
	private String orange;

	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItems(int id, String apple, String mango, String guava, String pomergrante, String orange) {
		super();
		this.id = id;
		this.apple = apple;
		this.mango = mango;
		this.guava = guava;
		this.pomergrante = pomergrante;
		this.orange = orange;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApple() {
		return apple;
	}

	public void setApple(String apple) {
		this.apple = apple;
	}

	public String getMango() {
		return mango;
	}

	public void setMango(String mango) {
		this.mango = mango;
	}

	public String getGuava() {
		return guava;
	}

	public void setGuava(String guava) {
		this.guava = guava;
	}

	public String getPomergrante() {
		return pomergrante;
	}

	public void setPomergrante(String pomergrante) {
		this.pomergrante = pomergrante;
	}

	public String getOrange() {
		return orange;
	}

	public void setOrange(String orange) {
		this.orange = orange;
	}

	@Override
	public String toString() {
		return "FoodItems [id=" + id + ", apple=" + apple + ", mango=" + mango + ", guava=" + guava + ", pomergrante="
				+ pomergrante + ", orange=" + orange + "]";
	}

}
