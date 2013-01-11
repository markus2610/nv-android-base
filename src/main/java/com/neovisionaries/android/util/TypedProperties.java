/*
 * Copyright (C) 2011-2013 Neo Visionaries Inc.
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
package com.neovisionaries.android.util;


public abstract class TypedProperties
{
    protected TypedProperties()
    {
    }


    /**
     * Get the value of the property identified by the key as boolean.
     * If {@code key} is null or there is no property for the key,
     * {@code defaultValue} is returned.
     */
    public abstract boolean getBoolean(String key, boolean defaultValue);


    /**
     * Equivalent to {@link #getBoolean(String, boolean)
     * getBoolean}{@code (key, defaultValue)}.
     */
    public boolean get(String key, boolean defaultValue)
    {
        return getBoolean(key, defaultValue);
    }


    /**
     * Equivalent to {@link #getBoolean(String, boolean)
     * getBoolean}{@code (key, false)}.
     */
    public boolean getBoolean(String key)
    {
        return getBoolean(key, false);
    }


    /**
     * Equivalent to {@link #getBoolean(String, boolean)
     * getBoolean}{@code (key.name(), defaultValue)}.
     * If {@code key} is null, {@code defaultValue} is returned.
     */
    public boolean getBoolean(Enum<?> key, boolean defaultValue)
    {
        if (key == null)
        {
            return defaultValue;
        }

        return getBoolean(key.name(), defaultValue);
    }


    /**
     * Equivalent to {@link #getBoolean(Enum, boolean)
     * getBoolean}{@code (key, defaultValue)}.
     */
    public boolean get(Enum<?> key, boolean defaultValue)
    {
        return getBoolean(key, defaultValue);
    }


    /**
     * Equivalent to {@link #getBoolean(String)
     * getBoolean}{@code (key.name())}.
     * if {@code key} is null, false is returned.
     */
    public boolean getBoolean(Enum<?> key)
    {
        if (key == null)
        {
            return false;
        }

        return getBoolean(key.name());
    }


    /**
     * Get the value of the property identified by the key as float.
     * If {@code key} is null or there is no property for the key,
     * {@code defaultValue} is returned.
     */
    public abstract float getFloat(String key, float defaultValue);


    /**
     * Equivalent to {@link #getFloat(String, float)
     * getFloat}{@code (key, defaultValue)}.
     */
    public float get(String key, float defaultValue)
    {
        return getFloat(key, defaultValue);
    }


    /**
     * Equivalent to {@link #getFloat(String, float)
     * getFloat}{@code (key, 0.0F)}.
     */
    public float getFloat(String key)
    {
        return getFloat(key, 0.0F);
    }


    /**
     * Equivalent to {@link #getFloat(String, float)
     * getFloat}{@code (key.name(), defaultValue)}.
     * If {@code key} is null, {@code defaultValue} is returned.
     */
    public float getFloat(Enum<?> key, float defaultValue)
    {
        if (key == null)
        {
            return defaultValue;
        }

        return getFloat(key.name(), defaultValue);
    }


    /**
     * Equivalent to {@link #getFloat(Enum, float)
     * getFloat}{@code (key, defaultValue)}.
     */
    public float get(Enum<?> key, float defaultValue)
    {
        return getFloat(key, defaultValue);
    }


    /**
     * Equivalent to {@link #getFloat(String)
     * getFloat}{@code (key.name())}.
     * If {@code key} is null, 0.0F is returned.
     */
    public float getFloat(Enum<?> key)
    {
        if (key == null)
        {
            return 0.0F;
        }

        return getFloat(key.name());
    }


    /**
     * Get the value of the property identified by the key as int.
     * If {@code key} is null or there is no property for the key,
     * {@code defaultValue} is returned.
     */
    public abstract int getInt(String key, int defaultValue);


    /**
     * Equivalent to {@link #getInt(String, int)
     * getInt}{@code (key, defaultValue)}.
     */
    public int get(String key, int defaultValue)
    {
        return getInt(key, defaultValue);
    }


    /**
     * Equivalent to {@link #getInt(String, int)
     * getInt}{@code (key, 0)}.
     */
    public int getInt(String key)
    {
        return getInt(key, 0);
    }


    /**
     * Equivalent to {@link #getInt(String, int)
     * getInt}{@code (key.name(), defaultValue)}.
     * If {@code key} is null}, {@code defaultValue} is returned.
     */
    public int getInt(Enum<?> key, int defaultValue)
    {
        if (key == null)
        {
            return defaultValue;
        }

        return getInt(key.name(), defaultValue);
    }


    /**
     * Equivalent to {@link #getInt(Enum, int)
     * getInt}{@code (key, defaultValue)}.
     */
    public int get(Enum<?> key, int defaultValue)
    {
        return getInt(key, defaultValue);
    }


    /**
     * Equivalent to {@link #getInt(String)
     * getInt}{@code (key.name())}.
     * If {@code key} is null, 0 is returned.
     */
    public int getInt(Enum<?> key)
    {
        if (key == null)
        {
            return 0;
        }

        return getInt(key.name());
    }


    /**
     * Get the value of the property identified by the key as long.
     * If {@code key} is null or there is no property for the key,
     * {@code defaultValue} is returned.
     */
    public abstract long getLong(String key, long defaultValue);


    /**
     * Equivalent to {@link #getLong(String, long)
     * getLong}{@code (key, defaultValue)}.
     */
    public long get(String key, long defaultValue)
    {
        return getLong(key, defaultValue);
    }


    /**
     * Equivalent to {@link #getLong(String, long)
     * getLong}{@code (key, 0L)}.
     */
    public long getLong(String key)
    {
        return getLong(key, 0L);
    }


    /**
     * Equivalent to {@link #getLong(String, long)
     * getLong}{@code (key.name(), defaultValue)}.
     * If {@code key} is null, {@code defaultValue} is returned.
     */
    public long getLong(Enum<?> key, long defaultValue)
    {
        if (key == null)
        {
            return defaultValue;
        }

        return getLong(key.name(), defaultValue);
    }


    /**
     * Equivalent to {@link #getLong(Enum, long)
     * getLong}{@code (key, defaultValue)}.
     */
    public long get(Enum<?> key, long defaultValue)
    {
        return getLong(key, defaultValue);
    }


    /**
     * Equivalent to {@link #getLong(String)
     * getLong}{@code (key.name())}.
     * If {@code key} is null, 0L is returned.
     */
    public long getLong(Enum<?> key)
    {
        if (key == null)
        {
            return 0L;
        }

        return getLong(key.name());
    }


    /**
     * Get the value of the property identified by the key as String.
     * If {@code key} is null or there is no property for the key,
     * {@code defaultValue} is returned.
     */
    public abstract String getString(String key, String defaultValue);


    /**
     * Equivalent to {@link #getString(String, String)
     * getString}{@code (key, defaultValue)}.
     */
    public String get(String key, String defaultValue)
    {
        return getString(key, defaultValue);
    }


    /**
     * Equivalent to {@link #getString(String, String)
     * getString}{@code (key, null)}.
     */
    public String getString(String key)
    {
        return getString(key, null);
    }


    /**
     * Equivalent to {@link #getString(String)
     * getString}{@code (key)}.
     */
    public String get(String key)
    {
        return getString(key);
    }


    /**
     * Equivalent to {@link #getString(String, String)
     * getString}{@code (key.name(), defaultValue)}.
     * If {@code key} is null, {@code defaultValue} is returned.
     */
    public String getString(Enum<?> key, String defaultValue)
    {
        if (key == null)
        {
            return defaultValue;
        }

        return getString(key.name(), defaultValue);
    }


    /**
     * Equivalent to {@link #getString(Enum, String)
     * getString}{@code (key, defaultValue)}.
     */
    public String get(Enum<?> key, String defaultValue)
    {
        return getString(key, defaultValue);
    }


    /**
     * Equivalent to {@link #getString(String)
     * getString}{@code (key.name())}.
     * If {@code key} is null, null is returned.
     */
    public String getString(Enum<?> key)
    {
        if (key == null)
        {
            return null;
        }

        return getString(key.name());
    }


    /**
     * Equivalent to {@link #getString(Enum)
     * getString}{@code (key)}.
     */
    public String get(Enum<?> key)
    {
        return getString(key);
    }


    /**
     * Set the value to the property identified by the key.
     * If {@code key} is null, nothing is done.
     */
    public abstract void setBoolean(String key, boolean value);


    /**
     * Equivalent to {@link #setBoolean(String, boolean)
     * setBoolean}{@code (key, value)}.
     */
    public void set(String key, boolean value)
    {
        setBoolean(key, value);
    }


    /**
     * Equivalent to {@link #setBoolean(String, boolean)
     * setBoolean}{@code (key.name(), value)}.
     * If {@code key} is null, nothing is done.
     */
    public void setBoolean(Enum<?> key, boolean value)
    {
        if (key == null)
        {
            return;
        }

        setBoolean(key.name(), value);
    }


    /**
     * Equivalent to {@link #setBoolean(Enum, boolean)
     * setBoolean}{@code (key, value)}.
     */
    public void set(Enum<?> key, boolean value)
    {
        setBoolean(key, value);
    }


    /**
     * Set the value to the property identified by the key.
     * If {@code key} is null, nothing is done.
     */
    public abstract void setFloat(String key, float value);


    /**
     * Equivalent to {@link #setFloat(String, float)
     * setFloat}{@code (key, value)}.
     */
    public void set(String key, float value)
    {
        setFloat(key, value);
    }


    /**
     * Equivalent to {@link #setFloat(String, float)
     * setFloat}{@code (key.name(), value)}.
     * If {@code key} is null, nothing is done.
     */
    public void setFloat(Enum<?> key, float value)
    {
        if (key == null)
        {
            return;
        }

        setFloat(key.name(), value);
    }


    /**
     * Equivalent to {@link #setFloat(Enum, float)
     * setFloat}{@code (key, value)}.
     */
    public void set(Enum<?> key, float value)
    {
        setFloat(key, value);
    }


    /**
     * Set the value to the property identified by the key.
     * If {@code key} is null, nothing is done.
     */
    public abstract void setInt(String key, int value);


    /**
     * Equivalent to {@link #setInt(String, int)
     * setInt}{@code (key, value)}.
     */
    public void set(String key, int value)
    {
        setInt(key, value);
    }


    /**
     * Equivalent to {@link #setInt(String, int)
     * setInt}{@code (key.name(), value)}.
     * If {@code key} is null, nothing is done.
     */
    public void setInt(Enum<?> key, int value)
    {
        if (key == null)
        {
            return;
        }

        setInt(key.name(), value);
    }


    /**
     * Equivalent to {@link #setInt(Enum, int)
     * setInt}{@code (key, value)}.
     */
    public void set(Enum<?> key, int value)
    {
        setInt(key, value);
    }


    /**
     * Set the value to the property identified by the key.
     * If {@code key} is null, nothing is done.
     */
    public abstract void setLong(String key, long value);


    /**
     * Equivalent to {@link #setLong(String, long)
     * setLong}{@code (key, value)}.
     */
    public void set(String key, long value)
    {
        setLong(key, value);
    }


    /**
     * Equivalent to {@link #setLong(String, long)
     * setLong}{@code (key.name(), value)}.
     * If {@code key} is null, nothing is done.
     */
    public void setLong(Enum<?> key, long value)
    {
        if (key == null)
        {
            return;
        }

        setLong(key.name(), value);
    }


    /**
     * Equivalent to {@link #setLong(Enum, long)
     * setLong}{@code (key, value)}.
     */
    public void set(Enum<?> key, long value)
    {
        setLong(key, value);
    }


    /**
     * Set the value to the property identified by the key.
     * If {@code key} is null, nothing is done.
     */
    public abstract void setString(String key, String value);


    /**
     * Equivalent to {@link #setString(String, String)
     * setString}{@code (key, value)}.
     */
    public void set(String key, String value)
    {
        setString(key, value);
    }


    /**
     * Equivalent to {@link #setString(String, String)
     * setString}{@code (key.name(), value)}.
     * If {@code key} is null, nothing is done.
     */
    public void setString(Enum<?> key, String value)
    {
        if (key == null)
        {
            return;
        }

        setString(key.name(), value);
    }


    /**
     * Equivalent to {@link #setString(Enum, String)
     * setString}{@code (key, value)}.
     */
    public void set(Enum<?> key, String value)
    {
        setString(key, value);
    }


    /**
     * Remove the property identified by the key.
     * If {@code key} is null, nothing is done.
     */
    public abstract void remove(String key);


    /**
     * Equivalent to {@link #remove(String)
     * remove}{@code (key.name())}.
     * If {@code key} is null, nothing is done.
     */
    public void remove(Enum<?> key)
    {
        if (key == null)
        {
            return;
        }

        remove(key.name());
    }


    /**
     * Clear all properties.
     */
    public abstract void clear();
}
