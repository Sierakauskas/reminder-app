package lt.reminder.app.bl.repo;

import lt.reminder.app.model.domain.EldershipEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EldershipRepository extends JpaRepository<EldershipEntity, Long> {
}
