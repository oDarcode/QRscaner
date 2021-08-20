package ru.dariamikhailukova.qrscaner.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Picture_table")
data class PictureEntity (
    @PrimaryKey var url: String,
    var name: String
): Parcelable