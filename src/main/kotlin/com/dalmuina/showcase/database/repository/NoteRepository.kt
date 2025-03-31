package com.dalmuina.showcase.database.repository

import com.dalmuina.showcase.database.model.Note
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface NoteRepository : MongoRepository<Note,ObjectId>{
    fun findByOwnerId(ownerId: ObjectId): List<Note>
}