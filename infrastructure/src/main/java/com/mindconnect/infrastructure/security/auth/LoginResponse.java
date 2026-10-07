package com.mindconnect.infrastructure.security.auth;

/**
 * Respuesta del endpoint POST /auth/login con el token JWT generado.
 */
public record LoginResponse(String token) {}
