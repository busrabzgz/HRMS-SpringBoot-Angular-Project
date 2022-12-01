package com.example.humanresources.common;

import java.lang.reflect.Field;
import java.util.List;

import org.apache.commons.lang3.reflect.FieldUtils;

public final class ReflectionUtil {
    public static List<Field> getAllField(Class<?> clazz) {
        System.out.println(clazz
        );
        List<Field> fields = FieldUtils.getAllFieldsList(clazz);
        System.out.println(fields);
        return null;
    }
}
