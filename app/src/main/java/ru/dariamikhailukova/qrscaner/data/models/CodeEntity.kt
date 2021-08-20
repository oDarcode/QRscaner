package ru.dariamikhailukova.qrscaner.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Code_table")
data class CodeEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var pictureUrl: String,
    var type: Int,
    var data: String
): Parcelable