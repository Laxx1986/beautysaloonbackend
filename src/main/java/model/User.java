package model;
import jakarta.validation.constraints.Size;
import lombok.*;
import javax.persistence.*;
import javax.persistence.Id;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "service_provider_id",
            joinColumns = @JoinColumn(name = "serviceProviderId"),
            inverseJoinColumns = @JoinColumn(name = "serviceProviderId")
    )
    private Set<ServiceProvider> serviceProvider;

    @Column(name = "username", nullable = false)
    @Size(max = 20)
    private String userName;

    @Column(name = "email", nullable = false)
    @Size(max = 50)
    private String email;

    @Column(name = "phone_number", nullable = true)
    private String phoneNumber;
    @Column(name="password", nullable = false)
    @Size(max = 20)
    private String password;
}
