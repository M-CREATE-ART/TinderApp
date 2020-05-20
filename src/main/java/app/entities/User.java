package app.entities;

import lombok.*;

@AllArgsConstructor
@Data
public class User {
    private final int id;
    private final String fullname;
    private final String email;
    private final String password;
    private final String lastLogin;
    private final String image;

}
