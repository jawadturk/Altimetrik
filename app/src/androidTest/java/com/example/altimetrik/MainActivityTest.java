package com.example.altimetrik;

import android.support.test.espresso.IdlingRegistry;
import android.support.test.espresso.IdlingResource;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.altimetrik.di.NetworkModule;
import com.example.altimetrik.view.MainActivity;
import com.jakewharton.espresso.OkHttp3IdlingResource;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Inject NetworkModule networkModule;

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void search() {


        onView(withId(R.id.editText_mainSearch))
                .check(matches(withText("")))
                .perform(typeText("Jenny"))
        .check(matches(withText("Jenny")))
        ;

        onView(withId(R.id.progress_proposals))
                .check(matches(not(isDisplayed())));

        onView(withId(R.id.fab))
                .perform(click());

        closeSoftKeyboard();
        onView(withId(R.id.editText_mainSearch))
                .check(matches(withText("")));




    }

    @Test
    public void clickItem() {
        onView(withId(R.id.list_proposals))
                .perform(RecyclerViewActions.actionOnItemAtPosition(9, click()));


    }


    @Test
    public void fetchData_showProgressBar_hideRecyclerView()
    {
        onView(withId(R.id.progress_proposals))
                .check(matches(not(isDisplayed())));

        onView(withId(R.id.list_proposals))
                .check(matches(isDisplayed()));

    }
}
