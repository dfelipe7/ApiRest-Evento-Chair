/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.edu.co.events.service;

import co.edu.unicauca.edu.co.events.domain.Event;
import java.util.List;

/**
 *
 * @author Unicauca
 */
public interface IEventService {
    public List<Event> findAll();
    public Event findById(Long id);
    public Event create(Event event);
    public Event update(Long id, Event event);
    public void deleteById(Long id);
}