package unitedstates;

public enum US {

    ALABAMA("Alabama","AL","US-AL"),
    ALASKA("Alaska","AK","US-AK"),
    ARIZONA("Arizona","AZ","US-AZ"),
    ARKANSAS("Arkansas","AR","US-AR"),
    CALIFORNIA("California","CA","US-CA"),
    COLORADO("Colorado","CO","US-CO"),
    CONNECTICUT("Connecticut","CT","US-CT"),
    DELAWARE("Delaware","DE","US-DE"),
    DISTRICT_OF_COLUMBIA("District of Columbia","DC","US-DC"),
    FLORIDA("Florida","FL","US-FL"),
    GEORGIA("Georgia","GA","US-GA"),
    HAWAII("Hawaii","HI","US-HI"),
    IDAHO("Idaho","ID","US-ID"),
    ILLINOIS("Illinois","IL","US-IL"),
    INDIANA("Indiana","IN","US-IN"),
    IOWA("Iowa","IA","US-IA"),
    KANSAS("Kansas","KS","US-KS"),
    KENTUCKY("Kentucky","KY","US-KY"),
    LOUISIANA("Louisiana","LA","US-LA"),
    MAINE("Maine","ME","US-ME"),
    MARYLAND("Maryland","MD","US-MD"),
    MASSACHUSETTS("Massachusetts","MA","US-MA"),
    MICHIGAN("Michigan","MI","US-MI"),
    MINNESOTA("Minnesota","MN","US-MN"),
    MISSISSIPPI("Mississippi","MS","US-MS"),
    MISSOURI("Missouri","MO","US-MO"),
    MONTANA("Montana","MT","US-MT"),
    NEBRASKA("Nebraska","NE","US-NE"),
    NEVADA("Nevada","NV","US-NV"),
    NEW_HAMPSHIRE("New Hampshire","NH","US-NH"),
    NEW_JERSEY("New Jersey","NJ","US-NJ"),
    NEW_MEXICO("New Mexico","NM","US-NM"),
    NEW_YORK("New York","NY","US-NY"),
    NORTH_CAROLINA("North Carolina","NC","US-NC"),
    NORTH_DAKOTA("North Dakota","ND","US-ND"),
    OHIO("Ohio","OH","US-OH"),
    OKLAHOMA("Oklahoma","OK","US-OK"),
    OREGON("Oregon","OR","US-OR"),
    PENNSYLVANIA("Pennsylvania","PA","US-PA"),
    RHODE_ISLAND("Rhode Island","RI","US-RI"),
    SOUTH_CAROLINA("South Carolina","SC","US-SC"),
    SOUTH_DAKOTA("South Dakota","SD","US-SD"),
    TENNESSEE("Tennessee","TN","US-TN"),
    TEXAS("Texas","TX","US-TX"),
    UTAH("Utah","UT","US-UT"),
    VERMONT("Vermont","VT","US-VT"),
    VIRGINIA("Virginia","VA","US-VA"),
    WASHINGTON("Washington","WA","US-WA"),
    WEST_VIRGINIA("West Virginia","WV","US-WV"),
    WISCONSIN("Wisconsin","WI","US-WI"),
    WYOMING("Wyoming","WY","US-WY"),
    PUERTO_RICO("Puerto Rico","PR","US-PR");

    String unnabreviated;
    String ANSIabbreviation;
    String ISOabbreviation;

    US(String unnabreviated, String ANSIabbreviation, String ISOabbreviation) {
        this.unnabreviated = unnabreviated;
        this.ANSIabbreviation = ANSIabbreviation;
        this.ISOabbreviation = ISOabbreviation;
    }
    
    /**
     * The full, unabbreviated name of this state.
     */
    public String getUnabbreviated() {
        return this.unabbreviated;
    }
    
    /**
     * The ANSI abbreviated name of this state, e.g. "NY", or "WY".
     */
    public String getANSIAbbreviation() {
        return this.ANSIAbbreviation;
    }
    
    /**
     * The ISO abbreviated name of this state, e.g. "US-NY", or "US-WY".
     */
    public String getISOAbbreviation() {
        return this.ISOAbbreviation;
    }

    /**
     * Parse string input to enum. Accepts unabbreviated and abbreviated forms.
     * Case insensitive.
     * @param input String to parse
     * @return The parsed US state, or null on failure.
     */
    public static US parse(String input) {
        if (null == input) {
            return null;
        }
        input = input.trim();
        for (US state : values()) {
            if (state.unnabreviated.equalsIgnoreCase(input)    ||
                state.ANSIabbreviation.equalsIgnoreCase(input) ||
                state.ISOabbreviation.equalsIgnoreCase(input)) {
                return state;
            }
        }
        return null;
    }
}
