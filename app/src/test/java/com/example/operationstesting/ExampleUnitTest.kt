package com.example.operationstesting

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    val c1 = Dog()
    @Test
    fun Test_DogMissing() {

        val expected ="The dog is under your feet"
        val actual = c1.DogMissing()
        assertEquals(expected, actual)
    }
    @Test
    fun Test_HomeworkAddtion() {

        val expected = 10
        val actual =c1.HomeworkAddtion(5, 5)
        assertEquals(expected, actual)
    }
    @Test
    fun Test_Homeworksubtraction() {

        val expected = 0
        val actual = c1.Homeworksubtraction(5, 5)
        assertEquals(expected, actual)
    }
    @Test
    fun Test_HomeworkMultiply() {

        val expected =25
        val actual = c1.HomeworkMultiply(5, 5)
        assertEquals(expected, actual)
    }

}