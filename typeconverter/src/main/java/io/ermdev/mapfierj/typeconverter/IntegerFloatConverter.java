package io.ermdev.mapfierj.typeconverter;

import io.ermdev.mapfierj.core.TypeConverter;
import io.ermdev.mapfierj.core.TypeConverterAdapter;
import io.ermdev.mapfierj.exception.TypeException;

@TypeConverter
public class IntegerFloatConverter extends TypeConverterAdapter<Integer, Float> {

    @Override
    public Object convert(Object o) throws TypeException {
        if(o != null) {
            if(o instanceof Integer)
                return convertTo((Integer) o);
            else if(o instanceof Float)
                return convertFrom((Float) o);
            else
                throw new TypeException("Invalid Type");
        }
        throw new TypeException("You can't convert a null object");
    }

    @Override
    public Float convertTo(Integer o) throws TypeException {
        try {
            return o.floatValue();
        } catch (Exception e) {
            throw new TypeException("Failed to convert");
        }
    }

    @Override
    public Integer convertFrom(Float o) throws TypeException {
        try {
            return o.intValue();
        } catch (Exception e) {
            throw new TypeException("Failed to convert");
        }
    }
}
