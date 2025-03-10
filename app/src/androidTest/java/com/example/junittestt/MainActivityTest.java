package com.example.junittestt;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    /*
     * Test case: testAddOperation
    @Rule
     * Deskripsi: Memverifikasi bahwa operasi penambahan berfungsi dengan benar pada UI
     * Langkah-langkah:
     * 1. Masukkan angka 12 di kolom input pertama
     * 2. Masukkan angka 8 di kolom input kedua
     * 3. Klik tombol penambahan
     * Hasil yang diharapkan: TextView hasil menampilkan 20.0
     */
    @Test
    public void testAddOperation() {
        // Masukkan nilai di EditTexts
        Espresso.onView(ViewMatchers.withId(R.id.editTextFirstNumber))
                .perform(ViewActions.typeText("12"), ViewActions.closeSoftKeyboard());

        Espresso.onView(ViewMatchers.withId(R.id.editTextSecondNumber))
                .perform(ViewActions.typeText("8"), ViewActions.closeSoftKeyboard());

        // Klik tombol tambah
        Espresso.onView(ViewMatchers.withId(R.id.buttonAdd))
                .perform(ViewActions.click());

        // Verifikasi hasil ditampilkan dengan benar
        Espresso.onView(ViewMatchers.withId(R.id.textViewResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("20.0")));
    }

    /*
     * Test case: testDivideOperation
     * Deskripsi: Memverifikasi bahwa operasi pembagian berfungsi dengan benar pada UI
     * Langkah-langkah:
     * 1. Masukkan angka 100 di kolom input pertama
     * 2. Masukkan angka 25 di kolom input kedua
     * 3. Klik tombol pembagian
     * Hasil yang diharapkan: TextView hasil menampilkan 4.0
     */
    @Test
    public void testDivideOperation() {
        // Masukkan nilai di EditTexts
        Espresso.onView(ViewMatchers.withId(R.id.editTextFirstNumber))
                .perform(ViewActions.typeText("100"), ViewActions.closeSoftKeyboard());

        Espresso.onView(ViewMatchers.withId(R.id.editTextSecondNumber))
                .perform(ViewActions.typeText("25"), ViewActions.closeSoftKeyboard());

        // Klik tombol pembagian
        Espresso.onView(ViewMatchers.withId(R.id.buttonDivide))
                .perform(ViewActions.click());

        // Verifikasi hasil ditampilkan dengan benar
        Espresso.onView(ViewMatchers.withId(R.id.textViewResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("4.0")));
    }

    /*
     * Test case: testInvalidInput
     * Deskripsi: Memverifikasi bahwa aplikasi menangani input tidak valid dengan benar
     * Langkah-langkah:
     * 1. Biarkan kolom input kosong
     * 2. Klik tombol perkalian
     * Hasil yang diharapkan: TextView hasil menampilkan "Input tidak valid"
     */
    @Test
    public void testInvalidInput() {
        // Klik tombol perkalian tanpa memasukkan nilai apapun
        Espresso.onView(ViewMatchers.withId(R.id.buttonMultiply))
                .perform(ViewActions.click());

        // Verifikasi pesan error ditampilkan
        Espresso.onView(ViewMatchers.withId(R.id.textViewResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("Input tidak valid")));
    }
}
