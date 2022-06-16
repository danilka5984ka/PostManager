package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {
    MovieList first = new MovieList(1, "Бладшот", "Боевик");
    MovieList second = new MovieList(2, "Вперёд", "Мультфильм");
    MovieList third = new MovieList(3, "Отель \"Белград\"", "Комедия");
    MovieList fourth = new MovieList(4, "Джентельмены", "Боевик");
    MovieList fifth = new MovieList(5, "Человек-невидимка", "Ужасы");
    MovieList sixth = new MovieList(6, "Троллию. Мировой тур", "Мультфильм");
    MovieList seventh = new MovieList(7, "Номер один", "Комедия");

    MovieManager manager = new MovieManager();

    @Test
    public void checkAddMovie() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        manager.findAll();

        MovieList[] actual = manager.findAll();
        MovieList[] expected = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkLimitMovieONe() {
        //MovieManager manager = new MovieManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        manager.findLast();

        MovieList[] actual = manager.findLast();
        MovieList[] expected = {fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkLimitMovieTwo() {
        //MovieManager manager = new MovieManager(5);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        manager.findLast();

        MovieList[] actual = manager.findLast();
        MovieList[] expected = {seventh, sixth, fifth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkLimitMovieThree() {
       // MovieManager manager = new MovieManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        manager.findLast();

        MovieList[] actual = manager.findLast();
        MovieList[] expected = {sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

}