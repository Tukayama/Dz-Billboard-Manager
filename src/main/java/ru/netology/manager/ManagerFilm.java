package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.Film;

@NoArgsConstructor
public class ManagerFilm {
    Film[] films = new Film[0];
    private int arrayLength = 10;

    public ManagerFilm(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public void addFilm(Film film) {

        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] getLastFilms() {
        int resultLength;
        if (films.length > arrayLength) {
            resultLength = arrayLength;
        } else {
            resultLength = films.length;
        }
        Film[] tmp = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = films[films.length - i - 1];
        }
        return tmp;
    }
}
