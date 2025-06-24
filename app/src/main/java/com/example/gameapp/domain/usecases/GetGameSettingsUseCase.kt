package com.example.gameapp.domain.usecases

import com.example.gameapp.domain.entity.GameSettings
import com.example.gameapp.domain.entity.Level
import com.example.gameapp.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
