package app.security;


import java.time.LocalDateTime;

public interface SpringSecurity {
    String getUsername();

    String getPassword();

    LocalDateTime getWorkStart();

    LocalDateTime getWorkEnd();

    long getId();
}
