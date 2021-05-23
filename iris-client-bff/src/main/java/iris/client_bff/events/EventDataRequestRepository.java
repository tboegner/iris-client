package iris.client_bff.events;

import iris.client_bff.events.EventDataRequest.DataRequestIdentifier;
import iris.client_bff.events.EventDataRequest.Status;

import java.time.Instant;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Jens Kutzsche
 */
public interface EventDataRequestRepository extends CrudRepository<EventDataRequest, DataRequestIdentifier> {

  @Query("select count(1) = 0 from EventDataRequest r where r.id = :code")
  boolean isCodeAvailable(UUID code);

  @Query("select count(r) from EventDataRequest r where r.metadata.created >= :date")
  int getCountSinceDate(Instant date);

  @Query("select count(r) from EventDataRequest r where r.status = :status")
  int getCountWithStatus(Status status);
}
