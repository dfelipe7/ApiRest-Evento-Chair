/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.edu.co.events.service;

import co.edu.unicauca.edu.co.events.access.EventRepository;
import co.edu.unicauca.edu.co.events.domain.Event;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author Unicauca
 */

@Service
public class EventService implements IEventService {

    @Autowired
    private EventRepository eventDao;

    @Override
    @Transactional
    public List<Event> findAll() {
        return (List<Event>) eventDao.findAll();
    }

    @Override
    @Transactional
    public Event findById(Long id) {
        return eventDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Event create(Event event) {
        return eventDao.save(event);
    }

    @Override
    @Transactional
    public Event update(Long id, Event event) {
        Event existingEvent = findById(id);
        if (existingEvent != null) {
            existingEvent.setName(event.getName());
            existingEvent.setChair(event.getChair());
            existingEvent.setCommittee(event.getCommittee());
            return eventDao.save(existingEvent);
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        eventDao.deleteById(id);
    }
}
