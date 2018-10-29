package com.solab.iso8583.parse;

/**
 * Custom class to parse fields of type LLLBCDBIN with BCD length.
 */
public class BcdLengthLllbinParseInfo extends LllbinParseInfo {

    public BcdLengthLllbinParseInfo() {
        super();
    }

    @Override
    protected int getLengthForBinaryParsing(final byte[] buf, final int pos) {
        return super.getLengthForBinaryParsing(buf, pos) / 2;
    }
}
