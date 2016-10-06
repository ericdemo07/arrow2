package com.arrow.util;

import com.arrow.InternalArrowException;
import com.arrow.SystemFailure;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.prefs.Preferences;

/**
 * Created by ayush.shukla on 10/3/2016.
 */
public class YamlLoader {
    public static void loadYaml() throws InternalArrowException {
        Yaml yaml = new Yaml();
        try {
            URL url = ClassLoader.getSystemResource("dev/application.yaml");
            String yamlPathAsString = url.toString().substring(6, url.toString().length());
            InputStream input = new FileInputStream(new File(yamlPathAsString));
            Preferences preferences = Preferences.userRoot().node("arrow-global");
            Map<String, String> data = (HashMap) yaml.load(input);
            data.forEach((k, v) -> preferences.put(k, v));
        } catch (IOException e) {
            SystemFailure.initiateException(e);

        }
    }
}
