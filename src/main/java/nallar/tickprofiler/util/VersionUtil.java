package nallar.tickprofiler.util;

import net.minecraft.server.MinecraftServer;

// 'constants' aren't constant, the build script replaces them with versioning information
@SuppressWarnings("MethodReturnAlwaysConstant")
public enum VersionUtil {
	;

	public static String detailedVersion() {
		String version = "";
		try {
			MinecraftServer minecraftServer = MinecraftServer.getServer();
			if (minecraftServer != null) {
				version = " on " + minecraftServer.getMinecraftVersion() + ' ' + minecraftServer.getServerModName();
			}
		} catch (NoClassDefFoundError ignored) {
		}
		return version() + version;
	}

	public static String version() {
		return "@MOD_NAME@ v@MOD_VERSION@ for MC@MC_VERSION@";
	}

	public static String versionNumber() {
		return "@MOD_VERSION@";
	}
}
