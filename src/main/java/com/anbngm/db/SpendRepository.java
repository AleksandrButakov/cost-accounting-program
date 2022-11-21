package com.anbngm.db;

import com.anbngm.entity.SpendEntity;

import javax.swing.*;

public interface SpendRepository {
    JList<SpendEntity> getAll();

}
