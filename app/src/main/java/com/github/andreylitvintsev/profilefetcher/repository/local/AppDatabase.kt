package com.github.andreylitvintsev.profilefetcher.repository.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.github.andreylitvintsev.profilefetcher.repository.model.Profile
import com.github.andreylitvintsev.profilefetcher.repository.model.ProjectRepository


@Database(entities = [Profile::class, ProjectRepository::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun profileDao(): ProfileDao
    abstract fun projectRepositoryDao(): ProjectRepositoryDao
}
