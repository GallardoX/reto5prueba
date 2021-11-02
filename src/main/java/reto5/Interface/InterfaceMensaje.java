/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto5.Interface;

import reto5.Modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author juanc
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
