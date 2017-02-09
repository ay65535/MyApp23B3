package com.github.ay65535.myapp23b3;

import android.app.Activity;
import android.os.Build;
import android.widget.Toast;

/**
 * Created by ay65535 on 2017/02/10.
 *
 * @author ay65535
 */

class SettingManager {

    static int showVersion(Activity activity) {
        try {
            Toast.makeText(activity, getVersionText(), Toast.LENGTH_LONG).show();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return 1;
        }
        return 0;
    }

    private static String getVersionText() {
        return "Version: " + getVersionNo();
    }

    static double getVersionNo() {
        return 1.0;
    }
}
