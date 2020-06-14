package com.ps.shared.domain;


/*
    allows you to isolate the spring Service annotation in one place.
    If a different framework is used in the future, it is modified in one place.
*/

@org.springframework.stereotype.Service
public @interface Service {
}
