package io.github.dlinov.leetcode;

public class Task468ValidateIPAddress {
    class Solution {
    private final String NEITHER = "Neither";

    public String validIPAddress(String IP) {
        if (IP.endsWith(".") || IP.endsWith(":")) return NEITHER;
        String[] parts = IP.split("\\.", 4);
        if (parts.length == 4) return validate4(parts);
        parts = IP.split(":", 8);
        if (parts.length == 8) return validate6(parts);
        return NEITHER;
    }

    private String validate4(String[] parts) {
        try {
            for (String part : parts) {
                if (part.isBlank() || part.startsWith("-") || (part.startsWith("0") && part.length() > 1) || part.length() > 3) return NEITHER;
                final int num = Integer.parseInt(part);
                if (num < 0 || num > 255) return NEITHER;
            }
        } catch (NumberFormatException exc) {
            return NEITHER;
        }
        return "IPv4";
    }

    private String validate6(String[] parts) {
        try {
            for (String part : parts) {
                if (part.isBlank() || part.startsWith("-") || part.length() > 4) return NEITHER;
                Integer.parseInt(part, 16);
            }
        } catch (NumberFormatException exc) {
            return NEITHER;
        }
        return "IPv6";
    }
    }
}