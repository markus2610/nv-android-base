/*
 * Copyright (C) 2012-2013 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.neovisionaries.android.app;


import android.view.KeyEvent;


/**
 * Base class for Activities that terminate the application when
 * they receive a key down event of {@code KEYCODE_BACK}.
 *
 * @author Takahiko Kawasaki
 */
public class BottomActivity extends BaseActivity
{
    /**
     * Call {@code this.}{@link #exit() exit()} if the give key code is
     * {@code KEYCODE_BACK}. This means {@code KEYCODE_BACK} causes
     * this application to terminate. If the given key code is not
     * {@code KEYCODE_BACK}, {@code super.onKeyDown(keyCode, event)}
     * is called.
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (ActivityHelper.exitOnBackKeyDown(this, keyCode, event))
        {
            // The given key code is KEYCODE_BACK.
            return true;
        }
        else
        {
            // Let the super class handle the key event.
            return super.onKeyDown(keyCode, event);
        }
    }
}
