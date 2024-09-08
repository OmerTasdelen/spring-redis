package redis.entitiy;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@jakarta.persistence.Entity
@Table
@Data
public class Entity {
    @Id
    private Long id;
}
