package com.example.restfx;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public abstract class ListTypeToken<T> implements ParameterizedType {
    @Override
    public Type[] getActualTypeArguments() {
        return new Type[] { getType() };
    }

    @Override
    public Type getRawType() {
        return List.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }

    protected abstract Type getType();
}
