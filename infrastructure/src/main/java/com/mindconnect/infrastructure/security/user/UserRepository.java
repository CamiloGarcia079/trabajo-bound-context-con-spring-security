package com.mindconnect.infrastructure.security.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Repositorio JPA para buscar usuarios por email (usado por Spring Security).
 */
public interface UserRepository extends JpaRepository<UserJpaEntity, UUID> {
    Optional<UserJpaEntity> findByEmail(String email);
}
