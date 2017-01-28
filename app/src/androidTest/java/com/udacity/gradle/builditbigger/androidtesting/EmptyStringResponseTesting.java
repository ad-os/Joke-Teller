package com.udacity.gradle.builditbigger.androidtesting;

import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

/**
 * Created by adhyan on 1/27/17.
 */

@RunWith(AndroidJUnit4.class)
public class EmptyStringResponseTesting {

    private String mResponse = null;
    private CountDownLatch mCountDownLatch;


    @Test
    public void testEmptyStringResponse() throws InterruptedException {
        mCountDownLatch = new CountDownLatch(1);
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.setListener(new EndpointsAsyncTask.AsyncResponse() {
            @Override
            public void processFinish(String output) {
                mResponse = output;
                mCountDownLatch.countDown();
            }
        }).execute();
        mCountDownLatch.await();
        Assert.assertNotEquals(mResponse, "");
    }
}
