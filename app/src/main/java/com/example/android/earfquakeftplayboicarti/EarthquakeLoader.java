package com.example.android.earfquakeftplayboicarti;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;



public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    String mUrls;

    public EarthquakeLoader(@NonNull Context context, String urls) {
        super(context);
        mUrls = urls;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override
    public List<Earthquake> loadInBackground() {
        if ( mUrls == null) {
            return null;
        }

        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrls);
        return earthquakes;
    }
}
