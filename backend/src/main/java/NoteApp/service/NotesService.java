package NoteApp.service;

import NoteApp.dto.NoteTitleDto;
import NoteApp.exception.UserNotFoundException;
import NoteApp.repository.NotesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Slf4j
@Service
public class NotesService {

    @Autowired
    private NotesRepository notesRepository;

    public List<NoteTitleDto> getNotesTitles(UUID userId){
        return notesRepository.findTitleByUserId(userId);
    }
}
