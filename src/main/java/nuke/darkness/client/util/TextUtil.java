package nuke.darkness.client.util;

import net.minecraft.util.text.translation.*;

public class TextUtil {

	public static String getFormattedText(String string) {
		return string.replaceAll("&", "\u00A7");
	}

	@SuppressWarnings("deprecated")
	public static String localize(String input, Object...format) {
		return I18n.translateToLocalFormatted(input, format);
	}

	public static String localizeEffect(String input, Object...format) {
		return getFormattedText(localize(input, format));
	}

	@SuppressWarnings("deprecated")
	public static boolean canTranslate(String key) {
		return I18n.canTranslate(key);
	}
}