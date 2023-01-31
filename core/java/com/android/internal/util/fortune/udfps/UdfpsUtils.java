/*
 * Copyright (C) 2024 FortuneOS
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.internal.util.fortune.udfps;

import android.content.Context;

import com.android.internal.util.ArrayUtils;

public class UdfpsUtils {
    public static boolean hasUdfpsSupport(Context context) {
        int[] udfpsProps = context.getResources().getIntArray(
                com.android.internal.R.array.config_udfps_sensor_props);

        return (!ArrayUtils.isEmpty(udfpsProps)
                || context.getResources().getBoolean(com.android.internal.R.bool.config_supportsUdfps));
    }
}
