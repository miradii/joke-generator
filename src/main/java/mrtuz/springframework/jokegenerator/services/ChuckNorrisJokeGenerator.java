package mrtuz.springframework.jokegenerator.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
public class ChuckNorrisJokeGenerator implements JokeGenereator{
    @Override
    public String getRandomJoke() {

        return (new ChuckNorrisQuotes()).getRandomQuote() ;
    }
}
