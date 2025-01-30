package com.example.journalapp.service;

import com.example.journalapp.entity.journalEntry;
import com.example.journalapp.repo.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class JournalEntryService {
    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public void  saveEntry(journalEntry  JE)
    {
        journalEntryRepo.save(JE);
    }
    public List<journalEntry> getAll(){
        return journalEntryRepo.findAll();
    }

    public Optional<journalEntry> findById(ObjectId id)
    {
        return journalEntryRepo.findById(id);
    }
    public void deleteById(ObjectId id)
    {
        journalEntryRepo.deleteById(id);
    }
}





//controller-> services -> repo