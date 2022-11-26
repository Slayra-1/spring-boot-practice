package com.fastcampus.springbootpractice.logic;

import java.util.List;

/**
 * @author Slayra
 * @date 2022-03-24
 **/
public interface Sort <T extends Comparable<T>> {

    List<T> sort(List<T> list);
}
