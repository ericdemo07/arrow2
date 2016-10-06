package com.arrow.internal;

import java.util.prefs.Preferences;

/**
 * Created by ayush.shukla on 10/5/2016.
 */
public class PreferenceManger {
    public static Preferences getPreferences() {
        Preferences preferences = Preferences.userRoot().node("arrow-global");
        return preferences;
    }
}
