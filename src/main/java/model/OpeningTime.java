package model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OPENING_TIME")
public class OpeningTime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="opening_time_id", nullable = false)
    private long openingTimeId;

    @Column(name = "date", nullable = false)
    private Date date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="time_from", nullable = false)
    private Timestamp timeFrom;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="time_to", nullable = false)
    private Timestamp timeTo;
}
