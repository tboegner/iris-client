package iris.client_bff.cases;

import iris.client_bff.cases.CaseDataRequest.DataRequestIdentifier;
import iris.client_bff.cases.CaseDataRequest.Status;

import java.time.Instant;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Jens Kutzsche
 */
public interface CaseDataRequestRepository extends CrudRepository<CaseDataRequest, DataRequestIdentifier> {

  @Query("select count(1) = 0 from CaseDataRequest r where r.id = :code")
  boolean isCodeAvailable(UUID code);

  @Query("select count(r) from CaseDataRequest r where r.metadata.created >= :date")
  int getCountSinceDate(Instant date);

  @Query("select count(r) from CaseDataRequest r where r.status = :status")
  int getCountWithStatus(Status status);

}
