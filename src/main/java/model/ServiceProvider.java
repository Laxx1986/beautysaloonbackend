package model;

import jakarta.validation.constraints.Size;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SERVICE_PROVIDER")
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "service_provider_id", nullable = false)
    private long serviceProviderId;

    @Column(name="service_provider_name", nullable = false)
    @Size(max = 50)
    private String serviceProviderName;



}
