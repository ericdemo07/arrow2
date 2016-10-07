package com.arrow.util;

import com.arrow.DistributionConfig;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ayush.shukla on 9/26/2016.
 */
public class ArrowCommonUtils {
    public static boolean nullEmptyCheck(Object value) {
        if (value instanceof String) {
            if (value != null && !((String) value).isEmpty() && !value.equals(DistributionConfig.nullChar)) {
                return true;
            }
        } else if (value instanceof Integer) {
            if (value != null && (int) value != 0) {
                return true;
            }
        } else if (value instanceof Collection) {
            if (value != null && ((Collection) value).isEmpty()) {

            }
        }

        return false;
    }

    public static <E> String collectionAsString(Collection<E> collection) {
        if (collection instanceof List) {
            if (collection != null && !(collection).isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                for (Iterator<E> iter = collection.iterator(); iter.hasNext(); ) {
                    stringBuilder.append(iter.next());
                    stringBuilder.append(',');
                }
                return stringBuilder.toString().substring(0,stringBuilder.length()-1);
            }
        }
        return DistributionConfig.nullChar;
    }
}


