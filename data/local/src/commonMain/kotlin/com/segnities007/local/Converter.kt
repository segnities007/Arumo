package com.segnities007.local

import androidx.room.TypeConverter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

class Converters {
    @TypeConverter
    fun fromStringList(value: List<String>): String {
        return Json.encodeToString(value)
    }

    @TypeConverter
    fun toStringList(value: String): List<String> {
        return Json.decodeFromString(value)
    }

    @TypeConverter
    fun fromStringBooleanMap(value: Map<String, Boolean>): String {
        return Json.encodeToString(value)
    }

    @TypeConverter
    fun toStringBooleanMap(value: String): Map<String, Boolean> {
        return Json.decodeFromString(value)
    }

    @OptIn(ExperimentalTime::class)
    @TypeConverter
    fun fromInstant(value: Instant): Long {
        return value.toEpochMilliseconds()
    }

    @OptIn(ExperimentalTime::class)
    @TypeConverter
    fun toInstant(value: Long): Instant {
        return Instant.fromEpochMilliseconds(value)
    }
}