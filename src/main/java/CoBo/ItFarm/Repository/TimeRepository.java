package CoBo.ItFarm.Repository;

import CoBo.ItFarm.Data.Entity.TimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<TimeEntity, Long> {
}
