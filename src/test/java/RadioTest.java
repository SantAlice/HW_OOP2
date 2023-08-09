import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testingStationSetter() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingSetterBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingSetterBoundary2() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingSetterBoundary3() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingSetterBoundary4() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingNextBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingNextBoundary2() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingNextBoundary3() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingNextBoundary4() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingPrevBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingPrevMinBounday2() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingPrevMinBounday3() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingPrevMinBounday4() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingVolumeSetter() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingVolumeSetterBelow() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingVolumeSetterAbove() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingVolumeBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);


        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingVolumeBoundary2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);


        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingVolumeUpBoundary() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingVolumeUpBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingVolumeUpBoundary2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingVolumeBoundaryDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void testingVolumeBoundaryUp3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testingVolumeBoundaryUp4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(actual, expected);
    }

}