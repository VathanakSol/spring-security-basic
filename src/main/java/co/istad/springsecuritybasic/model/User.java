package co.istad.springsecuritybasic.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="users_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true)
    private String email;

    private String password;

    private boolean isDisabled;

    private boolean isAccountLocked; // true if account is locked

    private boolean isAccountExpired; // true if account is expire

    private boolean isCredentialsExpired;

    @ManyToMany(fetch = FetchType.EAGER)
    // (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<Role> roles;
}
