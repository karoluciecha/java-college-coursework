package assessment;

/**
 * Enum representing ANSI escape codes for various text formatting styles
 * including regular colors, bold, underline, and background colors.
 * <p>
 * These codes are used to control text appearance in the terminal.
 * </p>
 * 
 * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI escape
 *      codes</a>
 */
public enum ConsoleColour {
	/** Resets all styles and colors. */
	RESET("Reset", "0"),

	/** Regular black text. */
	BLACK("Black [Regular]", "0;30"),
	/** Regular red text. */
	RED("Red [Regular]", "0;31"),
	/** Regular green text. */
	GREEN("Green [Regular]", "0;32"),
	/** Regular yellow text. */
	YELLOW("Yellow [Regular]", "0;33"),
	/** Regular blue text. */
	BLUE("Blue [Regular]", "0;34"),
	/** Regular purple text. */
	PURPLE("Purple [Regular]", "0;35"),
	/** Regular cyan text. */
	CYAN("Cyan [Regular]", "0;36"),
	/** Regular white text. */
	WHITE("White [Regular]", "0;37"),

	/** Bold black text. */
	BLACK_BOLD("Black [Bold]", "1;30"),
	/** Bold red text. */
	RED_BOLD("Red [Bold]", "1;31"),
	/** Bold green text. */
	GREEN_BOLD("Green [Bold]", "1;32"),
	/** Bold yellow text. */
	YELLOW_BOLD("Yellow [Bold]", "1;33"),
	/** Bold blue text. */
	BLUE_BOLD("Blue [Bold]", "1;34"),
	/** Bold purple text. */
	PURPLE_BOLD("Purple [Bold]", "1;35"),
	/** Bold cyan text. */
	CYAN_BOLD("Cyan [Bold]", "1;36"),
	/** Bold white text. */
	WHITE_BOLD("White [Bold]", "1;37"),

	/** Underlined black text. */
	BLACK_UNDERLINED("Black [Underline]", "4;30"),
	/** Underlined red text. */
	RED_UNDERLINED("Red [Underline]", "4;31"),
	/** Underlined green text. */
	GREEN_UNDERLINED("Green [Underline]", "4;32"),
	/** Underlined yellow text. */
	YELLOW_UNDERLINED("Yellow [Underline]", "4;33"),
	/** Underlined blue text. */
	BLUE_UNDERLINED("Blue [Underline]", "4;34"),
	/** Underlined purple text. */
	PURPLE_UNDERLINED("Purple [Underline]", "4;35"),
	/** Underlined cyan text. */
	CYAN_UNDERLINED("Cyan [Underline]", "4;36"),
	/** Underlined white text. */
	WHITE_UNDERLINED("White [Underline]", "4;37"),

	/** Black background. */
	BLACK_BACKGROUND("Black [Background]", "40"),
	/** Red background. */
	RED_BACKGROUND("Red [Background]", "41"),
	/** Green background. */
	GREEN_BACKGROUND("Green [Background]", "42"),
	/** Yellow background. */
	YELLOW_BACKGROUND("Yellow [Background]", "43"),
	/** Blue background. */
	BLUE_BACKGROUND("Blue [Background]", "44"),
	/** Purple background. */
	PURPLE_BACKGROUND("Purple [Background]", "45"),
	/** Cyan background. */
	CYAN_BACKGROUND("Cyan [Background]", "46"),
	/** White background. */
	WHITE_BACKGROUND("White [Background]", "47"),

	/** High intensity black text. */
	BLACK_BRIGHT("Black [High Intensity]", "0;90"),
	/** High intensity red text. */
	RED_BRIGHT("Red [High Intensity]", "0;91"),
	/** High intensity green text. */
	GREEN_BRIGHT("Green [High Intensity]", "0;92"),
	/** High intensity yellow text. */
	YELLOW_BRIGHT("Yellow [High Intensity]", "0;93"),
	/** High intensity blue text. */
	BLUE_BRIGHT("Blue [High Intensity]", "0;94"),
	/** High intensity purple text. */
	PURPLE_BRIGHT("Purple [High Intensity]", "0;95"),
	/** High intensity cyan text. */
	CYAN_BRIGHT("Cyan [High Intensity]", "0;96"),
	/** High intensity white text. */
	WHITE_BRIGHT("White [High Intensity]", "0;97"),

	/** Bold high intensity black text. */
	BLACK_BOLD_BRIGHT("Black [Bold High Intensity]", "1;90"),
	/** Bold high intensity red text. */
	RED_BOLD_BRIGHT("Red [Bold High Intensity]", "1;91"),
	/** Bold high intensity green text. */
	GREEN_BOLD_BRIGHT("Green [Bold High Intensity]", "1;92"),
	/** Bold high intensity yellow text. */
	YELLOW_BOLD_BRIGHT("Yellow [Bold High Intensity]", "1;93"),
	/** Bold high intensity blue text. */
	BLUE_BOLD_BRIGHT("Blue [Bold High Intensity]", "1;94"),
	/** Bold high intensity purple text. */
	PURPLE_BOLD_BRIGHT("Purple [Bold High Intensity]", "1;95"),
	/** Bold high intensity cyan text. */
	CYAN_BOLD_BRIGHT("Cyan [Bold High Intensity]", "1;96"),
	/** Bold high intensity white text. */
	WHITE_BOLD_BRIGHT("White [Bold High Intensity]", "1;97"),

	/** High intensity black background. */
	BLACK_BACKGROUND_BRIGHT("Black [High Intensity BG]", "0;100"),
	/** High intensity red background. */
	RED_BACKGROUND_BRIGHT("Red [High Intensity BG]", "0;101"),
	/** High intensity green background. */
	GREEN_BACKGROUND_BRIGHT("Green [High Intensity BG]", "0;102"),
	/** High intensity yellow background. */
	YELLOW_BACKGROUND_BRIGHT("Yellow [High Intensity BG]", "0;103"),
	/** High intensity blue background. */
	BLUE_BACKGROUND_BRIGHT("Blue [High Intensity BG]", "0;104"),
	/** High intensity purple background. */
	PURPLE_BACKGROUND_BRIGHT("Purple [High Intensity BG]", "0;105"),
	/** High intensity cyan background. */
	CYAN_BACKGROUND_BRIGHT("Cyan [High Intensity BG]", "0;106"),
	/** High intensity white background. */
	WHITE_BACKGROUND_BRIGHT("White [High Intensity BG]", "0;107");

	/** Escape sequence introducer. */
	private static final String CTRL_SEQ_INTRO = "\033[";
	/** Escape sequence terminator. */
	private static final String CTRL_SEQ_END = "m";

	private final String description;
	private final String colour;

	/**
	 * Constructs an ANSI color with a description and escape sequence.
	 *
	 * @param description : Human-readable name of the color style.
	 * @param colour      : ANSI escape sequence code.
	 */
	ConsoleColour(String description, String colour) {
		this.description = description;
		this.colour = colour;
	}

	/**
	 * Returns a human-readable description of the console colour.
	 *
	 * @return The description of the console colour.
	 */
	public String description() {
		return this.description;
	}

	/**
	 * Returns the ANSI escape code for the color as a string.
	 *
	 * @return : The ANSI escape code string.
	 */
	public String colour() {
		return toString();
	}

	/**
	 * Returns the full ANSI escape sequence string.
	 *
	 * @return : The ANSI escape code wrapped in the control sequence.
	 */
	@Override
	public String toString() {
		return CTRL_SEQ_INTRO + this.colour + CTRL_SEQ_END;
	}
}