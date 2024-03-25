package model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SERVICE_LENGTH")
public class ServiceLength {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="serive_length_id", nullable = false)
    private long serviceLengthId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="service_length", nullable = false)
    private Timestamp length;
}
