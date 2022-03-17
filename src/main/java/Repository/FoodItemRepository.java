package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import foodtracker.model.FoodItems;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItems, ID>{

}
