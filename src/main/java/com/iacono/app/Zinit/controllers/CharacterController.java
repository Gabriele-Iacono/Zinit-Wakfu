package com.iacono.app.Zinit.controllers;

import com.iacono.app.Zinit.models.Character;
import com.iacono.app.Zinit.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/characters")
public class CharacterController {
    @Autowired
    CharacterService characterService;

    // API per ottenere un personaggio specifico
    @GetMapping("/{id}")
    public ResponseEntity getCharacter (@PathVariable Long id){
        Optional<Character> characterOptional = characterService.getCharacter(id);
        if (characterOptional.isPresent()) {
            return new ResponseEntity<>(characterOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Personaggio non trovato",  HttpStatus.NOT_FOUND);
        }
    }

    // API per ottenere tutti i personaggi
    @GetMapping
    public ResponseEntity<List<Character>> getAllCharacters() {
        List<Character> characters = characterService.getAllCharacters();
        if (characters.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); //
        } else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    // API per ottenere tutti i personaggi con le relative skill
    @GetMapping("/with-skills")
    public ResponseEntity<List<Character>> getAllCharacterswithSkills() {
        List<Character> characters = characterService.getAllCharacters();
        if (characters.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }





}



