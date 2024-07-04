package com.example.carte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.carte.service.CardService;
import com.example.carte.model.Card;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
@CrossOrigin(origins = "*")
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping("/create")
    public Card createCard(@RequestBody Card card) {
        return cardService.createCard(card);
    }

    @GetMapping
    public List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    @GetMapping("/{id}")
    public Card getCardById(@PathVariable String id) {
        return cardService.getCardById(id);
    }

    @PutMapping("/{id}")
    public Card updateCard(@PathVariable String id, @RequestBody Card card) {
        return cardService.updateCard(id, card);
    }

    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable String id) {
        cardService.deleteCard(id);
    }
}
