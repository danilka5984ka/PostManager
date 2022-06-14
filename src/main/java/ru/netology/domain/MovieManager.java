package ru.netology.domain;

public class MovieManager {

    private int limitDefault = 10;

    public MovieManager() {
    }

    private int MaxLimit;

    public MovieManager(int limit) {
        this.MaxLimit = limit;
    }

    private MovieList[] movies = new MovieList[0];

    public void add(MovieList movie) {
        int length = movies.length + 1;
        MovieList[] tmp = new MovieList[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MovieList[] findAll() {
        return movies;
    }

    public MovieList[] findLast() {
        int resultLength;
        if (this.MaxLimit == this.limitDefault) {
            resultLength = 0;
        } else {
            resultLength = findAll().length;
        }
        MovieList[] result = new MovieList[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}

