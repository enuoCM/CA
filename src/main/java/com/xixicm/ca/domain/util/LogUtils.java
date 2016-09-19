/*
 * Copyright (C) 2016 mc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xixicm.ca.domain.util;

/**
 * @author mc
 */
public class LogUtils {
    private static Logger sLogger;

    public static void injectLogger(Logger logger) {
        sLogger = logger;
    }

    public static void v(String tag, String msg) {
        if (sLogger != null) {
            sLogger.v(tag, msg);
        }
    }


    public static void v(String tag, String msg, Throwable tr) {
        if (sLogger != null) {
            sLogger.v(tag, msg, tr);
        }
    }


    public static void d(String tag, String msg) {
        if (sLogger != null) {
            sLogger.d(tag, msg);
        }
    }


    public static void d(String tag, String msg, Throwable tr) {
        if (sLogger != null) {
            sLogger.d(tag, msg, tr);
        }
    }


    public static void i(String tag, String msg) {
        if (sLogger != null) {
            sLogger.i(tag, msg);
        }
    }


    public static void i(String tag, String msg, Throwable tr) {
        if (sLogger != null) {
            sLogger.i(tag, msg, tr);
        }
    }


    public static void w(String tag, String msg) {
        if (sLogger != null) {
            sLogger.w(tag, msg);
        }
    }


    public static void w(String tag, String msg, Throwable tr) {
        if (sLogger != null) {
            sLogger.w(tag, msg, tr);
        }
    }


    public static void e(String tag, String msg) {
        if (sLogger != null) {
            sLogger.e(tag, msg);
        }
    }


    public static void e(String tag, String msg, Throwable tr) {
        if (sLogger != null) {
            sLogger.e(tag, msg, tr);
        }
    }
}
