package com.oksik.oknote.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.oksik.oknote.db.entity.Note

@Dao
interface NoteDao{
    @Insert
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)

    @Update
    fun update(note: Note)

    @Query("DELETE FROM notes_table")
    fun deleteAllNotes()

    @Query("SELECT * FROM notes_table")
    fun getAllNotes(): LiveData<List<Note>>
}
