/*
 * Copyright (C) 2024 FortuneOS
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.systemui.fortune

import com.android.systemui.qs.tileimpl.QSTileImpl
import com.android.systemui.qs.tiles.PowerShareTile
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface FortuneOSModule {

    /** Inject PowerShareTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(PowerShareTile.TILE_SPEC)
    fun bindPowerShareTile(powerShareTile: PowerShareTile): QSTileImpl<*>
}
