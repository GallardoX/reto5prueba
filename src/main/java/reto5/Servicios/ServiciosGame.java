/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.Servicios;

import reto5.Modelo.Game;
import reto5.Repositorio.GameRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class ServiciosGame {
        @Autowired
    private GameRepositorio metodosCrud;
    
    public List<Game> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Game> getGame(int idGame){
        return metodosCrud.getGame(idGame);
    }
    
    public Game save(Game game){
        if(game.getId()==null){
            return metodosCrud.save(game);
        }else{
            Optional<Game> evt=metodosCrud.getGame(game.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(game);
            }else{
                return game;
            }
        }
    }
    public Game update(Game game){
        if(game.getId()!=null){
            Optional<Game> e=metodosCrud.getGame(game.getId());
            if(!e.isEmpty()){
                if(game.getName()!=null){
                    e.get().setName(game.getName());
                }
                if(game.getAddress()!=null){
                    e.get().setAddress(game.getAddress());
                }
                if(game.getExtension()!=null){
                    e.get().setExtension(game.getExtension());
                }
                if(game.getDescription()!=null){
                    e.get().setDescription(game.getDescription());
                }
                if(game.getCategory()!=null){
                    e.get().setCategory(game.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return game;
            }
        }else{
            return game;
        }
    }


    public boolean deleteGame(int gameId) {
        Boolean aBoolean = getGame(gameId).map(game -> {
            metodosCrud.delete(game);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
    
}
