package NoteApp.repository;

import NoteApp.dto.NoteTitleDto;
import NoteApp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NotesRepository extends JpaRepository<Note, UUID> {

    Optional<Note> findByUserId(UUID id);

    @Query("select new NoteApp.dto.NoteTitleDto(Notes.id, Notes.title, Notes.updatedAt) " +
            "from Notes where Notes.id = :id")
    List<NoteTitleDto> findTitleByUserId(UUID id);
}
