package com.shoes.service;

import com.shoes.model.Contact;
import com.shoes.model.NewsLetter;
import com.shoes.repository.ContactRepository;
import com.shoes.repository.NewsLetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommonServiceImpl implements CommonService{
    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private NewsLetterRepository newsLetterRepository;

    @Override
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void saveNews(NewsLetter newsLetter) {
        newsLetterRepository.save(newsLetter);
    }

    @Override
    public List<Contact> getAllContact() {
        return contactRepository.findAll();
    }

    @Override
    public List<NewsLetter> getAllNewsletter() {
        return newsLetterRepository.findAll();
    }

    @Override
    public void deleteContact(Long id) {
      contactRepository.deleteById(id);
    }
}
