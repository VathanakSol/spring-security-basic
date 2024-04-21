package co.istad.springsecuritybasic.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="authorities_table")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
}
