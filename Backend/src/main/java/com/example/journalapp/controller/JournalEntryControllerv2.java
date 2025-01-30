package com.example.journalapp.controller;

import com.example.journalapp.entity.journalEntry;
import com.example.journalapp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journals")
public class JournalEntryControllerv2 {

    @Autowired
    private JournalEntryService journalEntryService;







     @GetMapping //Get http://localhost:8080/journals
   public List<journalEntry> getAll(){
       return  journalEntryService.getAll();
   }

   @PostMapping  // Post http://localhost:8080/journals
   public journalEntry createEntry(@RequestBody journalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
    journalEntryService.saveEntry(myEntry);
    return myEntry ;
   }


    @GetMapping("id/{myId}")  //   http://localhost:8080/journals/id/2
   public  journalEntry getEntry(@PathVariable ObjectId myId){

         return journalEntryService.findById(myId).orElse(null);
   }

   @DeleteMapping("id/{myId}")
    public boolean deleteById(@PathVariable ObjectId myId){
       journalEntryService.deleteById(myId);
       return true;

    }

 @PutMapping("id/{myId}")
    public  journalEntry updateById(@PathVariable ObjectId myId ,@RequestBody journalEntry newEntry)
    {
       journalEntry old=journalEntryService.findById(myId).orElse(null);
       if(old!=null)
       {
           old.setTitle(newEntry.getTitle()!=null && newEntry.getTitle().equals("")?old.getTitle():newEntry.getTitle());
           old.setContent(newEntry.getContent()!=null && newEntry.getContent().equals("")?old.getContent():newEntry.getContent());
       }
       //efef
       journalEntryService.saveEntry(old);
       return old;
    }

}
