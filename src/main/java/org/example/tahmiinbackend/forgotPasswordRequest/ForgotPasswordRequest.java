package org.example.tahmiinbackend.forgotPasswordRequest;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table
public class ForgotPasswordRequest {
    @Id
    @SequenceGenerator(
            name = "forgot_password_request_sequence",
            sequenceName = "forgot_password_request_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "forgot_password_request_sequence"
    )
    private Long forgotPasswordRequestId;
    private String userEmail;
    private String forgotPasswordRequestToken;

    public ForgotPasswordRequest() {
    }

    public ForgotPasswordRequest(Long forgotPasswordRequestId, String userEmail, String forgotPasswordRequestToken) {
        this.forgotPasswordRequestId = forgotPasswordRequestId;
        this.userEmail = userEmail;
        this.forgotPasswordRequestToken = forgotPasswordRequestToken;
    }

    public ForgotPasswordRequest(String userEmail, String forgotPasswordRequestToken) {
        this.userEmail = userEmail;
        this.forgotPasswordRequestToken = forgotPasswordRequestToken;
    }
}