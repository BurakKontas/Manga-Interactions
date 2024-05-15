package com.aburakkontas.manga.common.auth.queries;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterQuery {

//    @NotBlank(message = "Email cannot be blank")
//    @Email(message = "Invalid email format")
    private final String email;

//    @NotBlank(message = "First name cannot be blank")
    private final String firstName;

//    @NotBlank(message = "Last name cannot be blank")
    private final String lastName;

//    @Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters")
//    @Pattern.List({
//            @Pattern(regexp = "(?=.*[A-Z]).+", message = "Password must contain at least one uppercase letter"),
//            @Pattern(regexp = "(?=.*\\d).+", message = "Password must contain at least one digit"),
//            @Pattern(regexp = "(?=.*\\W).+", message = "Password must contain at least one special character")
//    })
    private final String password;
}
