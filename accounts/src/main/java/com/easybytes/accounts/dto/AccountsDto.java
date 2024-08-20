package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "Account Number can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account Number of eazyBank account", example = "3454433243"
    )
    private Long accountNumber;
    @NotEmpty(message = "Account Type can not be null or empty")
    @Schema(
            description = "Account Type of eazyBank account", example = "Savings"
    )
    private String accountType;
    @NotEmpty(message = "Branch Address can not be null or empty")
    @Schema(
            description = "Eazy Bank branch address", example = "123 NewYork"
    )
    private String branchAddress;
}
