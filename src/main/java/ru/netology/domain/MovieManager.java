package ru.netology.domain;

public class MovieManager {

    private int maxLimit;
    private MovieList[] movies = new MovieList[0];

    public MovieManager(int limit) {
        maxLimit = limit;
    }

    public MovieManager() {
        maxLimit = 10;
    }

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
        if (maxLimit < findAll().length) {
            resultLength = maxLimit;
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

