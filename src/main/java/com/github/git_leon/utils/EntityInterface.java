package com.github.git_leon.utils;

import java.io.Serializable;

public interface EntityInterface<IdType extends Serializable> {
    IdType getId();
}
