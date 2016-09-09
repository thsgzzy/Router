package com.lzh.nonview.router;

public class Utils {

    /**
     * Adjust if the scheme is http or https
     * @param scheme scheme for uri
     * @return return true if is http or https
     */
    public static boolean isHttp (String scheme) {
        return scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https");
    }

    /**
     * Check if the class is valid by clzName
     * @param clzName class name
     * @return return true if the clz name is supported
     */
    public static boolean isClassSupport (String clzName) {
        try {
            Class.forName(clzName);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
