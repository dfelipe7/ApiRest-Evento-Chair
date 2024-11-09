/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.edu.co.events.access;

import co.edu.unicauca.edu.co.events.domain.Event;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Unicauca
 */
public interface EventRepository extends CrudRepository<Event, Long> {
    
    
}
