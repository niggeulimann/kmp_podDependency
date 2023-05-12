package de.getslash.pos_mobile.podtestapp

import platform.UIKit.UIDevice
import cocoapods.AFNetworking.*
import cocoapods.CouchbaseLite.*


class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()