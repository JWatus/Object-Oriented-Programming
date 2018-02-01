package com.infoshare.jdev.ds;

import com.infoshare.jdev.ds.common.RegexpExample;

public class Main {

    private static final String[] EMAILS = {
            "john.doe@test.com",
            "test.com@john",
            "my123456!@#$%^&*@email.com",
            "my-mail@dot.com",
            "m@m@@mama.com",
            "labla0$@mail.com",
            "my-mail.dot.com"
    };

    public static void main(String[] args) {
        RegexpExample validator = new RegexpExample();
        for (String mail : EMAILS) {
            if (validator.validate(mail))
                System.out.println(mail);
        }
    }
}
