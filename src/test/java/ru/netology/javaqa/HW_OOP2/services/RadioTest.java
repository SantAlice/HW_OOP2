package ru.netology.javaqa.HW_OOP2.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 public class RadioTest {

    @Test //тестируем выставление текущей станции
    public void testingStationSetter() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(actual, expected);
    }

    @Test //мнимальные пограничные значения сеттера
    public void testingSetterBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test //макисмальные пограничные значения сеттера
    public void testingSetterBoundary2() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test // тестируем возможность сета отрицательного знаяения
    public void testingSetterBoundary3() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем возможность вытсавить номер больше максимального
    public void testingSetterBoundary4() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем эквивалетные значения next
    public void testingNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем максимальные пограничные значения next
    public void testingNextBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем максимальные пограничные значения next
    public void testingNextBoundary2() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем минимальные пограничные значения next
    public void testingNextBoundary3() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем минимальные пограничные значения next
    public void testingNextBoundary4() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем эквивалетные занчения prev
    public void testingPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем минимальные пограничные значения prev
    public void testingPrevBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем минимальные пограничные значения prev
    public void testingPrevMinBounday2() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем максимальные пограничные значения prev
    public void testingPrevMinBounday3() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем максимальные пограничные значения prev
    public void testingPrevMinBounday4() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем сет грамкости
    public void testingVolumeSetter() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем возможность выставить отрицательную громкость
    public void testingVolumeSetterBelow() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем возможность выставить громкость больше максимальной
    public void testingVolumeSetterAbove() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем максимальные пограничные значения громкости
    public void testingVolumeBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);


        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем минимальные пограничные значения громкости
    public void testingVolumeBoundary2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);


        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем возможность повысить громкость с помощью кнопки, больше максимальной
    public void testingVolumeUpBoundary() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем максимальные пограничные значения повышения громкости
    public void testingVolumeUpBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем минимальные пограничные значения повышения громкости
    public void testingVolumeUpBoundary2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем возможность понизить громкость ниже нулевой
    public void testingVolumeBoundaryDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }


    @Test //тестируем минимальные пограничные значения понижения громкости
    public void testingVolumeBoundaryUp3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test //тестируем максимальные пограничные знаяения понижения громкости
    public void testingVolumeBoundaryUp4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(actual, expected);
    }


    @Test //тестируем возможность выставить сколичество станций + выставить текущую
     public void shouldSetMax(){
        Radio radio = new Radio(43);

        radio.setCurrentStation(34);

        int actual = radio.getCurrentVolume();
        int expected = 34;
    }

     @Test //тестируем минимальные пограничные значения сеттера, регресс
     public void shouldSetMaxBoundary(){
         Radio radio = new Radio(43);

         radio.setCurrentStation(0);

         int actual = radio.getCurrentVolume();
         int expected = 0;
     }

     @Test //тестируем минимальные пограничные значения сеттера, регресс
     public void shouldSetMaxBoundary2(){
         Radio radio = new Radio(43);

         radio.setCurrentStation(1);

         int actual = radio.getCurrentVolume();
         int expected = 1;
     }

     @Test //тестируем максимальные пограничные значения сеттера, регресс
     public void shouldSetMaxBoundary3(){
         Radio radio = new Radio(43);

         radio.setCurrentStation(43);

         int actual = radio.getCurrentVolume();
         int expected = 43;
     }

     @Test //тестируем максимальные пограничные значения сеттера, регресс
     public void shouldSetMaxBoundary4(){
         Radio radio = new Radio(43);

         radio.setCurrentStation(42);

         int actual = radio.getCurrentVolume();
         int expected = 42;
     }

     @Test //тестируем эквивалентные значения next, регресс
     public void shouldSetNext() {
         Radio radio = new Radio(43);

         radio.setCurrentStation(34);

         radio.next();

         int actual = radio.getCurrentStation();
         int expected = 35;

         Assertions.assertEquals(actual, expected);
     }

     @Test //тестируем максимальные эквивалентные значения next, регресс
     public void shouldSetNextBoundary() {
         Radio radio = new Radio(43); //т.к это не цифра станий, а их количество

         radio.setCurrentStation(41); //последняя получается 42, т.к макс станция это количество -1

         radio.next();

         int actual = radio.getCurrentStation();
         int expected = 42;

         Assertions.assertEquals(actual, expected);
     }

     @Test //тестируем максимальные эквивалентные значения next, регресс
     public void shouldSetNextBoundary2() {
         Radio radio = new Radio(43); //т.к это не цифра станий, а их количество

         radio.setCurrentStation(42); //последняя получается 42, т.к макс станция это количество -1

         radio.next();

         int actual = radio.getCurrentStation();
         int expected = 0;

         Assertions.assertEquals(actual, expected);
     }

     @Test //тестируем минимальные эквивалентные значения next, регресс
     public void shouldSetNextBoundary3() {
         Radio radio = new Radio(43);

         radio.setCurrentStation(0);

         radio.next();

         int actual = radio.getCurrentStation();
         int expected = 1;

         Assertions.assertEquals(actual, expected);
     }

     @Test //тестируем минимальные эквивалентные значения next, регресс
     public void shouldSetNextBoundary4() {
         Radio radio = new Radio(43);

         radio.setCurrentStation(1);

         radio.next();

         int actual = radio.getCurrentStation();
         int expected = 2;

         Assertions.assertEquals(actual, expected);
     }
     //тестируем prev

     @Test //тестируем эквивалетные значения prev, регресс
     public void shouldSetPrev() {
         Radio radio = new Radio(43);

         radio.setCurrentStation(34);

         radio.prev();

         int actual = radio.getCurrentStation();
         int expected = 33;

         Assertions.assertEquals(actual, expected);
     }

     @Test //тестируем максимальные пограничные значения prev, регресс
     public void shouldSetPrevBoundary1() {
         Radio radio = new Radio(43);

         radio.setCurrentStation(42);

         radio.prev();

         int actual = radio.getCurrentStation();
         int expected = 41;

         Assertions.assertEquals(actual, expected);
     }

     @Test //тестируем максимальные пограничные значения prev, регресс
     public void shouldSetPrevBoundary2() {
         Radio radio = new Radio(43);

         radio.setCurrentStation(41);

         radio.prev();

         int actual = radio.getCurrentStation();
         int expected = 40;

         Assertions.assertEquals(actual, expected);
     }

     @Test //тестируем минимальные пограничные значения prev, регресс
     public void shouldSetPrevBoundary3() {
         Radio radio = new Radio(43);

         radio.setCurrentStation(0);

         radio.prev();

         int actual = radio.getCurrentStation();
         int expected = 42;

         Assertions.assertEquals(actual, expected);
     }

     @Test //тестируем минимальные пограничные значения prev, регресс
     public void shouldSetPrevBoundary4() {
         Radio radio = new Radio(43);

         radio.setCurrentStation(1);

         radio.prev();

         int actual = radio.getCurrentStation();
         int expected = 0;

         Assertions.assertEquals(actual, expected);
     }
}

