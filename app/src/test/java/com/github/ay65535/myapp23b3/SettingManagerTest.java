package com.github.ay65535.myapp23b3;

import android.app.Activity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ay65535 on 2017/02/10.
 *
 * @author ay65535
 */
public class SettingManagerTest {
    @Test
    public void getVersionNo() throws Exception {
        assertEquals(1.0, SettingManager.getVersionNo(), 0.1);
    }

    @Test
    public void showVersion() throws Exception {
        assertEquals(1, SettingManager.showVersion(new Activity()));
    }

}