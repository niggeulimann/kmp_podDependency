package de.getslash.pos_mobile.podtestapp

import platform.UIKit.UIDevice
import cocoapods.CouchbaseLite.CBLConsoleLogger


class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()