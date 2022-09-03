package app.models;

import java.time.LocalDateTime;

public interface OfficerInter {
    String getUsername();

    String getPassword();

    LocalDateTime getWorkStart();

    LocalDateTime getWorkEnd();

    long getId();
}
