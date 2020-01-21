package com.tericcabrel.authorization.dtos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

@ApiModel(value = "RefreshTokenParam", description = "Parameters required to create or update user")
public class RefreshTokenDto {
    @ApiModelProperty(notes = "Refresh token to used to validate the user and generate a new token", required = true)
    @NotBlank(message = "The token is required")
    private String token;

    public String getToken() {
        return token;
    }

    public RefreshTokenDto setToken(String token) {
        this.token = token;
        return this;
    }
}
