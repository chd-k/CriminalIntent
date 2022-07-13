package com.bignerdranch.android.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID
import java.util.Date


//Define structure of table
@Entity
data class Crime(
    @PrimaryKey val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean
)
