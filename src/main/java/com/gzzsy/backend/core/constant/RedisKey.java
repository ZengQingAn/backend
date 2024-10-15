package com.gzzsy.backend.core.constant;

import org.springframework.util.StringUtils;

public class RedisKey {
    public static final String NAMESPACE = "backend-archetype:";

    public static final String LOCK_PREFIX = "LOCK:";

    public static final String CACHE_PREFIX = "CACHE:";

    private static String getKey(String pattern, Object... args) {
        if (!StringUtils.hasText(pattern)) {
            throw new IllegalArgumentException("pattern expected not to be blank, but got " + pattern);
        }

        return NAMESPACE + String.format(pattern, args);
    }

    public static String getLockKey(String pattern, Object... args) {
        String lockPattern = LOCK_PREFIX + pattern;
        return getKey(lockPattern, args);
    }

    public static String getCacheKey(String pattern, Object... args) {
        String cachePattern = CACHE_PREFIX + pattern;
        return getKey(cachePattern, args);
    }
}
