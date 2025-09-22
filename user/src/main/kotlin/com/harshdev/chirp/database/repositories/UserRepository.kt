package com.harshdev.chirp.database.repositories

import org.springframework.data.jpa.repository.JpaRepository
import com.harshdev.chirp.model.UserId
import com.harshdev.chirp.database.entities.UserEntity

interface UserRepository : JpaRepository<UserEntity, UserId> {
    fun findByEmail(email: String): UserEntity?
    fun findByEmailOrUsername(email: String, username: String): UserEntity?
}