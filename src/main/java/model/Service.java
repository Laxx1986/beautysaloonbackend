package model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SERVICE")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="service_id", nullable = false)
    private long serviceId;

    @Column(name="service_name", nullable = false)
    private String serviceName;

    @ManyToOne
    @JoinColumn(name="serviceLengthId")
    private ServiceLength serviceLength;

    @Column(name = "service_price", nullable = false)
    private int servicePrice;
}
