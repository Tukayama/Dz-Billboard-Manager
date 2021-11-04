package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerFilmTest {
    Film one = new Film(1, "Bloodshot", "action", false);
    Film two = new Film(2, "Forward", "cartoon", false);
    Film three = new Film(3, "Hotel Belgrade", "comedy", false);
    Film four = new Film(4, "The Gentlemen", "action", false);
    Film five = new Film(5, "The Invisible Man", "horror", false);
    Film six = new Film(6, "Trolls World Tour", "cartoon", true);
    Film seven = new Film(7, "Number one", "comedy", true);
    Film eigth = new Film(8, "Justice League", "fantastic", false);
    Film nine = new Film(9, "Tell her", "drama", false);
    Film ten = new Film(10, "North wind", "drama", true);
    Film eleven = new Film(11, "Nobody", "cartoon", false);

    @Test
    void lastFilmsBelowLimit() {
        ManagerFilm manager = new ManagerFilm();
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        Film[] actual = manager.getLastFilms();
        Film[] expected = new Film[]{seven, six, five, four, three, two, one};
        assertArrayEquals(expected, actual);

    }

    @Test
    void lastFilmsAboveLimit() {
        ManagerFilm maneger = new ManagerFilm();

        maneger.addFilm(one);
        maneger.addFilm(two);
        maneger.addFilm(three);
        maneger.addFilm(four);
        maneger.addFilm(five);
        maneger.addFilm(six);
        maneger.addFilm(seven);
        maneger.addFilm(eigth);
        maneger.addFilm(nine);
        maneger.addFilm(ten);
        maneger.addFilm(eleven);
        Film[] actual = maneger.getLastFilms();
        Film[] expected = new Film[]{eleven, ten, nine, eigth, seven, six, five, four, three, two};
        assertArrayEquals(expected, actual);


    }

    @Test
    void lastSomeFilmsBelowLimit() {
        ManagerFilm mfnager = new ManagerFilm(3);
        mfnager.addFilm(one);
        mfnager.addFilm(two);
        mfnager.addFilm(three);
        mfnager.addFilm(four);
        mfnager.addFilm(five);
        mfnager.addFilm(six);
        mfnager.addFilm(seven);
        Film[] actual = mfnager.getLastFilms();
        Film[] expected = new Film[]{seven, six, five};
        assertArrayEquals(expected, actual);
    }

    @Test
    void lastSomeFilmsAboveLimit() {
        ManagerFilm manager = new ManagerFilm(9);
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        Film[] actual = manager.getLastFilms();
        Film[] expected = new Film[]{seven, six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }
}