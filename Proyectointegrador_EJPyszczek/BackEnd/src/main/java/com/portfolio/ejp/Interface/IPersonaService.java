package com.portfolio.ejp.Interface;

import com.portfolio.ejp.Entity.Persona;
import java.util.List;


public interface IPersonaService {
  //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guarda un objeto de tipo Persoma
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long Id);
    
    //Buscar una Persona por ID
    public Persona findPersona(Long Id);
    
}
