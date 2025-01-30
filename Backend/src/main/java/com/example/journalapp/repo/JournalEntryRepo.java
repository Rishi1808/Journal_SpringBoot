package com.example.journalapp.repo;

import com.example.journalapp.entity.journalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo  extends MongoRepository<journalEntry, ObjectId> {

}
