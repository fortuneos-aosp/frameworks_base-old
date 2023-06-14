/*
 * Copyright (C) 2024 FortuneOS
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.systemui.fortune

import com.android.systemui.qs.tileimpl.QSTileImpl
import com.android.systemui.qs.tiles.AODTile
import com.android.systemui.qs.tiles.CellularTile
import com.android.systemui.qs.tiles.PowerShareTile
import com.android.systemui.qs.tiles.HeadsUpTile
import com.android.systemui.qs.tiles.WifiTile
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface FortuneOSModule {

    /** Inject AODTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(AODTile.TILE_SPEC)
    fun bindAODTile(aodTile: AODTile): QSTileImpl<*>

    /** Inject CellularTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(CellularTile.TILE_SPEC)
    fun bindCellularTile(cellularTile: CellularTile): QSTileImpl<*>
    
    /** Inject PowerShareTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(PowerShareTile.TILE_SPEC)
    fun bindPowerShareTile(powerShareTile: PowerShareTile): QSTileImpl<*>

    /** Inject HeadsUpTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(HeadsUpTile.TILE_SPEC)
    fun bindHeadsUpTile(headsUpTile: HeadsUpTile): QSTileImpl<*>

    /** Inject WifiTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(WifiTile.TILE_SPEC)
    fun bindWifiTile(wifiTile: WifiTile): QSTileImpl<*>
}
