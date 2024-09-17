package com.iacono.app.Zinit.services;

import com.iacono.app.Zinit.models.Character;
import com.iacono.app.Zinit.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public Optional<Character> getCharacter(Long id) {
        return characterRepository.findById(id);
    }

    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }


}
