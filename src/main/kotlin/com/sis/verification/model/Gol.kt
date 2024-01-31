package com.sis.verification.model

// Gol.kt

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "gol")
data class Gol(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "gol_number", nullable = false)
    val golNumber: Int,

    @Column(name = "timestamp", nullable = false)
    val timestamp: LocalDateTime = LocalDateTime.now()
)
