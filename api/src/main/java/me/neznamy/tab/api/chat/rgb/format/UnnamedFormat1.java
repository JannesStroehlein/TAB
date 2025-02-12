package me.neznamy.tab.api.chat.rgb.format;

/**
 * Formatter for &#RRGGBB
 */
public class UnnamedFormat1 implements RGBFormatter {

	@Override
	public String reformat(String text) {
		return text.contains("&#") ? text.replace("&#", "#") : text;
	}
}