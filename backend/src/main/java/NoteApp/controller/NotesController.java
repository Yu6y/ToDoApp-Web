package NoteApp.controller;

import NoteApp.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/notes")
public class NotesController {

    @Autowired
    private NotesService notesService;

    @GetMapping("/title")
    public ResponseEntity<?> getNotesTitles(@PathVariable UUID userId){
        return HttpResponse<LostnotesServi.getNotesTitles(userId);
    }
}
