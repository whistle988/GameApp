package com.example.gameapp.domain.repository

import com.example.gameapp.domain.entity.GameSettings
import com.example.gameapp.domain.entity.Level
import com.example.gameapp.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}