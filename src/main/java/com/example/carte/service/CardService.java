package com.example.carte.service;

// UserService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.carte.repository.CardRepository;
import com.example.carte.model.Card;
import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public Card createCard(Card card) {
        return cardRepository.save(card);
    }

    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    public Card getCardById(String id) {
        return cardRepository.findById(id).orElse(null);
    }

    public Card updateCard(String id, Card card) {
        card.setId(id);
        return cardRepository.save(card);
    }

    public void deleteCard(String id) {
        cardRepository.deleteById(id);
    }
}
