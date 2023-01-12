package com.shoes.service;

import com.shoes.model.Contact;
import com.shoes.model.NewsLetter;

import java.util.List;

public interface CommonService {

    void saveContact(Contact contact);
    void saveNews(NewsLetter newsLetter);
    List<Contact> getAllContact();
    List<NewsLetter> getAllNewsletter();

    void deleteContact(Long id);
}
