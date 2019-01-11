package com.codingapi.tx.client.aspect.transaction;

/**
 * Description:
 * Date: 19-1-11 下午1:23
 *
 * @author ujued
 */
@FunctionalInterface
public interface BusinessSupplier {

    Object get() throws Throwable;
}
