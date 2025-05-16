package com.lerningspringboot.daytwo.Controller;

import com.lerningspringboot.daytwo.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalController {

    private Map<Long, JournalEntry> journalEntries= new HashMap<>();

   @GetMapping
   private List<JournalEntry> getall(){
       return new ArrayList<>(journalEntries.values());
   }

   @PostMapping
   public  boolean createEntry(@RequestBody JournalEntry myEntry){
      journalEntries.put(myEntry.getId(),myEntry);
      return true;
   }

   @GetMapping("id/{myid}")
   public JournalEntry getJournalEntryById(@PathVariable long myid){
       return journalEntries.get(myid);
   }

    @DeleteMapping("id/{myid}")
    public JournalEntry deleteJournalEntryById(@PathVariable long myid){
        return journalEntries.remove(myid);
    }

    @PutMapping("id/{myid}")
    public JournalEntry updateJournalEntryById(@PathVariable long id,@RequestBody JournalEntry myEntry){
        return journalEntries.put(id,myEntry);
    }

}
